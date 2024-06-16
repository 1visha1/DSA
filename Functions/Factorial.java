public class Factorial {

    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String... args) {
        int number = 10;  // You can change this to test other values
        System.out.print("Factorial of " + number + " is: " + fact(number));
    }
}
