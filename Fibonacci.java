public class Fibonacci {
    public static int fib(int n) {
        // Base Cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive Step
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fib(n)); // Output: 8
    }
}
