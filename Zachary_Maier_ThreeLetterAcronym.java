import java.util.Scanner;

public class Zachary_Maier_ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three words:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        int numWords = Math.min(words.length, 3);

        StringBuilder acronym = new StringBuilder();
        for (int i = 0; i < numWords; i++) {
            acronym.append(words[i].charAt(0));
}

        System.out.println("Three-letter acronym: " + acronym.toString().toUpperCase());
    }
}
