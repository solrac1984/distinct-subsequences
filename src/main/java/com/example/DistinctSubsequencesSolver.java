package com.example;

public class DistinctSubsequencesSolver {
    public int countDistinctSubsequences(String s, String t) {
        int m = s.length(), n = t.length();
        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        // Caso base: t vacío -> siempre hay 1 subsecuencia válida
        prev[0] = 1;

        for (int i = 1; i <= m; i++) {
            curr[0] = 1;  // Reiniciar la fila actual
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + prev[j];
                } else {
                    curr[j] = prev[j];
                }
            }
            // Avanzamos la fila
            prev = curr.clone();
        }

        return prev[n];
    }
}
