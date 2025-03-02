package com.example.test;

import com.example.DistinctSubsequencesSolver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSubsequencesSolverTest {

    private final DistinctSubsequencesSolver solver = new DistinctSubsequencesSolver();

    @Test
    public void testExample1() {
        assertEquals(3, solver.countDistinctSubsequences("rabbbit", "rabbit"));
    }

    @Test
    public void testExample2() {
        assertEquals(5, solver.countDistinctSubsequences("babgbag", "bag"));
    }

    @Test
    public void testNoSubsequences() {
        assertEquals(0, solver.countDistinctSubsequences("abc", "xyz"));
    }

    @Test
    public void testEmptyTarget() {
        assertEquals(1, solver.countDistinctSubsequences("abc", ""));
    }

    @Test
    public void testEmptySource() {
        assertEquals(0, solver.countDistinctSubsequences("", "abc"));
    }

    @Test
    public void testIdenticalStrings() {
        assertEquals(1, solver.countDistinctSubsequences("abc", "abc"));
    }

    @Test
    public void testLargerTarget() {
        assertEquals(0, solver.countDistinctSubsequences("abc", "abcd"));
    }
}
