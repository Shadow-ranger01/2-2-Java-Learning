public class ArmstrongRecursion {

    // Helper to find the number of digits
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    // Recursive function to calculate the sum of powers
    public static int sumOfPowers(int n, int power) {
        if (n == 0) return 0;
        
        // Extract the last digit
        int digit = n % 10;
        
        // Add digit^power to the sum of the rest of the number
        return (int) Math.pow(digit, power) + sumOfPowers(n / 10, power);
    }

    public static boolean isArmstrong(int n) {
        int power = countDigits(n);
        return n == sumOfPowers(n, power);
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
