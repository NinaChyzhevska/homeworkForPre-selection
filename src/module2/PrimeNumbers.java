package module2;

public class PrimeNumbers {

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void printPrimeNumbers() {
        for (int i = 0; i < 50000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers();
    }
}
