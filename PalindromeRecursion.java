public class PalindromeRecursion {

    public static boolean isPalindrome(String s) {
        // 1. Base Case: If string is empty or has one char
        if (s.length() <= 1) {
            return true;
        }

        // 2. Check first and last characters
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        if (first != last) {
            return false;
        }

        // 3. Recursive Step: Check the substring inside
        // substring(1, length-1) removes the first and last letters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String word = "racecar";
        
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
