package com.example;

public class DistinctSubsequencesSolver {
    public int countDistinctSubsequences(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dp = new int[m + 1][n + 1];

        // Llenamos la primera columna: Si t está vacío, siempre hay una subsecuencia válida
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Llenamos la tabla de abajo hacia arriba
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}
