package module2;

import java.lang.reflect.Array;

public class ConvertNumbers {

    static String convertNumberToString(int num) {
        if (num < 0 || num > 10000) {
            throw new IllegalArgumentException("Invalid number");
        }

        if (num < 20) {
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            return arr[num];
        }

        if (num < 100) {
            String[] arr = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            int decimal = num / 10;
            int unit = num % 10;
            String decimalStr = arr[decimal - 2];
            if (unit == 0) {
                return decimalStr;
            }

            String unitStr = convertNumberToString(unit);
            return decimalStr + "-" + unitStr;
        }

        if (num < 1000) {
            int hundred = num / 100;
            String hundredStr = convertNumberToString(hundred) + " hundred ";
            int decimalAndUnits = num % 100;
            if (decimalAndUnits == 0) {
                return hundredStr;
            }
            String convertDecAndUnits = convertNumberToString(decimalAndUnits);
            return hundredStr + convertDecAndUnits;
        }

        int thousand = num / 1000;
        String thousandStr = convertNumberToString(thousand) + " thousand ";
        int hundredsEtc = num % 1000;
        if (hundredsEtc == 0) {
            return thousandStr;
        }
        String convertHundredsEtc = convertNumberToString(hundredsEtc);
        return thousandStr + convertHundredsEtc;
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 150; i++) {
            System.out.println(convertNumberToString(i));
        }
        for (int i = 9980; i <= 10000; i++) {
            System.out.println(convertNumberToString(i));
        }
    }
}
