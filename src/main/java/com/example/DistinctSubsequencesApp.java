package com.example;

public class DistinctSubsequencesApp {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";

        DistinctSubsequencesSolver solver = new DistinctSubsequencesSolver();
        int result = solver.countDistinctSubsequences(s, t);

        System.out.println("Número de subsecuencias distintas: " + result);
    }
}
