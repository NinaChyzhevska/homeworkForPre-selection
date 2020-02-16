package module2;

import java.util.Arrays;

public class ArrayStat {

    static double getArithmeticMean(int[] arr) {
        int sumOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
        }

        return (double) sumOfElements / arr.length;
    }

    static void printMedian(int[] arr) {
        Arrays.sort(arr);

        double median;
        int i = arr.length / 2;

        if (arr.length % 2 == 1) {
            median = arr[i];
        } else {
            median = (arr[i - 1] + arr[i]) / 2.0;
        }

        System.out.println("The median is: " + median);
    }

    static void printModa(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int maxCount = 1;
        int moda = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count > maxCount) {
                maxCount = count;
                moda = arr[i];
            }
        }
        System.out.println("The moda is: " + moda);
    }

    static void printStandardDeviation(int[] arr) {
        double arithmeticMean = getArithmeticMean(arr);
        double sum = 0;
        for (int element : arr) {
            sum += Math.pow(element - arithmeticMean, 2);
        }

        System.out.println("The standard deviation is: " + Math.sqrt(sum / arr.length));
    }

    public static void main(String[] args) {
        int[] data = {3,4,8,0,1,9,12,3,3,1,1,1,12};
        System.out.println("The arithmetic mean is: "+ getArithmeticMean(data));
        printMedian(data);
        printModa(data);
        printStandardDeviation(data);
    }
}
