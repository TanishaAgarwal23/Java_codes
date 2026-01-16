package DaaPracTanisha;
import java.util.*;

public class BoyerMoore {

    // Function to preprocess the bad character heuristic
    private static int[] preprocessBadCharacter(String pattern) {
        int[] badChar = new int[256]; // For ASCII characters
        Arrays.fill(badChar, -1);

        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;
        }

        return badChar;
    }

    // Boyer-Moore algorithm for pattern searching
    public static void boyerMooreSearch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        int[] badChar = preprocessBadCharacter(pattern);

        int shift = 0; // Starting index in the text

        while (shift <= n - m) {
            int j = m - 1;

            // Keep reducing j while characters match
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            // If the pattern is found
            if (j < 0) {
                System.out.println("Pattern found at index " + shift);
                
                // Shift the pattern so that the next character aligns
                shift += (shift + m < n) ? m - badChar[text.charAt(shift + m)] : 1;
            } else {
                // Shift the pattern based on the bad character heuristic
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
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

        // Perform Boyer-Moore pattern searching
        boyerMooreSearch(text, pattern);

        scanner.close();
    }
}

