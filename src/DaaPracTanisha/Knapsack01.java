package DaaPracTanisha;

import java.util.Scanner;

public class Knapsack01 {
    
    // Function to solve the 0/1 Knapsack problem using Dynamic Programming
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of items
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        // Input the number of items
        System.out.print("Enter the number of items: ");
        int n1 = scanner.nextInt();

        // Input the weights and values of the items
        int[] weights = new int[n1];
        int[] values = new int[n1];

        System.out.println("Enter the weights of the items: ");
        for (int i = 0; i < n1; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println("Enter the values of the items: ");
        for (int i = 0; i < n1; i++) {
            values[i] = scanner.nextInt();
        }

        // Input the capacity of the knapsack
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        // Solve the 0/1 Knapsack problem
        int maxProfit = knapsack(weights, values, capacity);

        // Output the result
        System.out.println("The maximum profit is: " + maxProfit);

        scanner.close();
    }
}
