package com.demo.javcore.helper;

public class ValidationUtil {

    // Kiem tra tuoi hop le
    public static boolean isValidAge(int age) {
        return age >= 6 && age <= 100;
    }
        // kiem tra diem hop le
    public static boolean isValidScore(float score) {
        return score >= 0 && score <= 10;
    }
}
