import java.util.Scanner;

public class Zachary_Maier_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        String cleanPhrase = phrase.replaceAll("\\s", "").toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < cleanPhrase.length() / 2; i++) {
            if (cleanPhrase.charAt(i) != cleanPhrase.charAt(cleanPhrase.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The phrase \"" + phrase + "\" is a palindrome.");
        } else {
            System.out.println("The phrase \"" + phrase + "\" is not a palindrome.");
        }
    }
}
