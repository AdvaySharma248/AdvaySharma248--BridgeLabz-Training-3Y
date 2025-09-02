import java.util.Scanner;

public class PalindromeChecker {
	String text;

	PalindromeChecker(String text) {
		this.text = text;
	}

	public boolean isPalindrome() {
		String cleanText = text.replaceAll("\\s+", "").toLowerCase();
		String reversedText = new StringBuilder(cleanText).reverse().toString();
		return cleanText.equals(reversedText);
	}

	public void displayResult() {
		if (isPalindrome()) {
			System.out.println("'" + text + "' is a palindrome. ✅");
		} else {
			System.out.println("'" + text + "' is not a palindrome. ❌");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word or phrase to check: ");
		String inputText = scanner.nextLine();
		
		PalindromeChecker checker = new PalindromeChecker(inputText);
		checker.displayResult();
		
		scanner.close();
	}
}