package SprintPhase;

import java.util.Arrays;
// RECURSION WITH MEMOIZATION

public class factorial {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        
        // System.out.println(Arrays.toString(dp));
        System.out.println(fac(n, dp));
        System.out.println(Arrays.toString(dp));
    }

    private static int fac(int n, int[] dp) {
        if (n < 2) return n;
        if (dp[n] != 0) return dp[n];
        int s = fac(n - 1, dp);
        int e = fac(n - 2, dp);
        dp[n - 1] = s;
        dp[n - 2] = e;
        dp[n] = s + e;
        return dp[n];
   
    }
}
