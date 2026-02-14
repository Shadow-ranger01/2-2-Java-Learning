public class Factorial {
    public static int factorial(int n) {
        // 1. Base Case
        if (n <= 1) {
            return 1;
        }
        // 2. Recursive Step
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result); // Output: 120
    }
}
