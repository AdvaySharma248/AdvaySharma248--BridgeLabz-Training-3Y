import java.util.Scanner;
import java.util.Arrays;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check for palindrome: ");
        String text = scanner.nextLine();

        boolean isPalindrome1 = isPalindromeIterative(text);
        System.out.println("Logic 1 (Iterative): Is it a palindrome? " + isPalindrome1);

        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Logic 2 (Recursive): Is it a palindrome? " + isPalindrome2);

        boolean isPalindrome3 = isPalindromeWithReverse(text);
        System.out.println("Logic 3 (Reverse Array): Is it a palindrome? " + isPalindrome3);

        scanner.close();
    }

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        return reverse;
    }

    public static boolean isPalindromeWithReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        return Arrays.equals(original, reversed);
    }
}