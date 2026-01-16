package DaaPracTanisha;

import java.util.*;

public class SetCover {

    // Function to find the minimum set cover
    public static List<Set<String>> findSetCover(Set<String> universe, List<Set<String>> subsets) {
        List<Set<String>> result = new ArrayList<>();
        
        Set<String> covered = new HashSet<>();

        while (!covered.containsAll(universe)) {
            Set<String> bestSubset = null;
            int maxCovered = 0;

            // Find the subset that covers the most uncovered elements
            for (Set<String> subset : subsets) {
                Set<String> temp = new HashSet<>(subset);
                temp.removeAll(covered);

                if (temp.size() > maxCovered) {
                    bestSubset = subset;
                    maxCovered = temp.size();
                }
            }

            // Add the best subset to the result and update covered elements
            if (bestSubset != null) {
                result.add(bestSubset);
                covered.addAll(bestSubset);
            } else {
                break; // No progress can be made
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the universe
        System.out.println("Enter the elements of the universe (space-separated):");
        String[] universeInput = scanner.nextLine().split(" ");
        Set<String> universe = new HashSet<>(Arrays.asList(universeInput));

        // Input the subsets
        System.out.println("Enter the number of subsets:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<Set<String>> subsets = new ArrayList<>();
        System.out.println("Enter the subsets (elements space-separated, one subset per line):");
        for (int i = 0; i < n; i++) {
            String[] subsetInput = scanner.nextLine().split(" ");
            subsets.add(new HashSet<>(Arrays.asList(subsetInput)));
        }

        // Find and print the minimum set cover
        List<Set<String>> setCover = findSetCover(universe, subsets);

        System.out.println("The minimum set cover is:");
        for (Set<String> subset : setCover) {
            System.out.println(subset);
        }

        scanner.close();
    }
}
