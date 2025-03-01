package com.example;

import java.util.HashMap;
import java.util.Map;

public class DistinctSubsequencesSolver {
    private Map<String, Integer> memo;

    public DistinctSubsequencesSolver() {
        this.memo = new HashMap<>();
    }

    public int countDistinctSubsequences(String s, String t) {
        return countHelper(s, t, s.length(), t.length());
    }

    private int countHelper(String s, String t, int m, int n) {
        // Caso base: si t está vacío, hay una subsecuencia válida
        if (n == 0) return 1;

        // Caso base: si s está vacío y t no, no hay subsecuencias posibles
        if (m == 0) return 0;

        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result;
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            result = countHelper(s, t, m - 1, n - 1) + countHelper(s, t, m - 1, n);
        } else {
            result = countHelper(s, t, m - 1, n);
        }

        // Guardamos en el mapa antes de retornar
        memo.put(key, result);
        return result;
    }
}
