package com.example;

public class DistinctSubsequencesSolver {
    public int countDistinctSubsequences(String s, String t) {
        return countHelper(s, t, s.length(), t.length());
    }

    private int countHelper(String s, String t, int m, int n) {
        // Caso base: si el string t está vacío, hay una subsecuencia válida
        if (n == 0) return 1;

        // Caso base: si s está vacío y t no, no hay subsecuencias posibles
        if (m == 0) return 0;

        // Si los caracteres coinciden, tenemos dos opciones:
        // 1. Tomarlo y reducir ambos strings (m-1, n-1)
        // 2. Omitirlo y solo reducir s (m-1, n)
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            return countHelper(s, t, m - 1, n - 1) + countHelper(s, t, m - 1, n);
        } else {
            // Si los caracteres no coinciden, solo podemos reducir s
            return countHelper(s, t, m - 1, n);
        }
    }
}
