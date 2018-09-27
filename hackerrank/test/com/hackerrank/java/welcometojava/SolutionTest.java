package com.hackerrank.java.welcometojava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testValidSolutionResult() {
        assertEquals("Hello, World.\nHello, Java.", solution.result());
    }
}