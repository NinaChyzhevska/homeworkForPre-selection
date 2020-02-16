package module2;

public class ChineseZodiac {

    static void printChineseZodiac(int year) {
        if (year < 0) {
            System.out.println("Invalid year. Please write a positive number");
            return;
        }

        switch (year % 12) {
            case 0:
                System.out.println("A monkey year");
                break;
            case 1:
                System.out.println("A rooster year");
                break;
            case 2:
                System.out.println("A dog year");
                break;
            case 3:
                System.out.println("A pig year");
                break;
            case 4:
                System.out.println("A rat/mouse year");
                break;
            case 5:
                System.out.println("An ox year");
                break;
            case 6:
                System.out.println("A tiger year");
                break;
            case 7:
                System.out.println("A rabbit year");
                break;
            case 8:
                System.out.println("A dragon year");
                break;
            case 9:
                System.out.println("A snake year");
                break;
            case 10:
                System.out.println("A horse year");
                break;
            case 11:
                System.out.println("A goat/sheep year");
                break;
        }
    }

    static void printChineseZodiac2(int year) {
        if (year < 0) {
            System.out.println("Invalid year. Please write a positive number");
            return;
        }

        String[] possibleZodiac = {"A monkey year", "A rooster year", "A dog year", "A pig year", "A rat/mouse year",
                "An ox year", "A tiger year", "A rabbit year", "A dragon year", "A snake year", "A horse year", "A goat/sheep year"};
        System.out.println(possibleZodiac[year % 12]);
    }

    public static void main(String[] args) {
        printChineseZodiac(2020);
        printChineseZodiac2(2021);
    }
}
