package module1;

public class QuadraticEquation {

    public static void solveEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("The equation isn't quadratic!");
            return;
        }

        if (d < 0) {
            System.out.println("The equation doesn't have rational solutions");
            return;
        }

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        if (x1 == x2) {
            System.out.println("The root is: " + x1);
        } else {
            System.out.println("The roots are: " + x1 + " and " + x2);
        }
    }

    public static void main(String[] args) {
        solveEquation(0, 5, 3);
    }
}
