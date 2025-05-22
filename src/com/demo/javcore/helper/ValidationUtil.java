package com.demo.javcore.helper;

public class ValidationUtil {

    // Kiểm tra tuổi hợp lệ (6 đến 100)
    public static boolean isValidAge(int age) {
        return age >= 6 && age <= 100;
    }

    // Kiểm tra điểm hợp lệ (0 đến 10)
    public static boolean isValidScore(float score) {
        return score >= 0 && score <= 10;
    }
}
