package Dp;

public class NumberOfWaysToSum {
    public static int countWays(int total, int k) {
        int mod = 1_000_000_007; // Use a large prime number for modulo operation
        int[] dp = new int[total + 1];
        dp[0] = 1;

        for (int i = 1; i <= k; i++) {
            for (int j = i; j <= total; j++) {
                dp[j] = (dp[j] + dp[j - i]) % mod; // Use modulo operation to prevent overflow
            }
        }

        return dp[total];
    }

    public static void main(String[] args) {
        int total = 5;
        int k = 3;
        System.out.println("Number of ways to sum to " + total + " with numbers up to " + k + ": " + countWays(total, k));
    }
}

