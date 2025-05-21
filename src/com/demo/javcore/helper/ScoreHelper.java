package com.demo.javcore.helper;

public class ScoreHelper {
    public static boolean isValidScore(double score) {
        return score >= 0 && score <= 10;
    }
}
