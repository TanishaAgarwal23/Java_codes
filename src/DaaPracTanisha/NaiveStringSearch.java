package DaaPracTanisha;
import java.util.Scanner;
public class NaiveStringSearch {
    // Function to perform Naive Pattern Searching
    public static void naiveSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        // Slide the pattern over the text one by one
        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;

            // Check for pattern match at current position
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If the pattern is found
            if (j == patternLength) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the text and pattern
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();
        // Perform Naive Pattern Searching
        naiveSearch(text, pattern);
        scanner.close();
    }
}

