import java.util.Scanner;

public class TrainingFeedbackTextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Feedback: ");
        String text = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0, others = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("\nTEXT ANALYSIS");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Symbols: " + others);

        sc.close();
    }
}