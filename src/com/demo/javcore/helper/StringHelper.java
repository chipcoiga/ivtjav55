package com.demo.javcore.helper;

public class StringHelper {
    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Input bị null");
            return true;
        }

        if (input.equals("")) {
            System.out.println("Input bi empty hoac chi chua khoang trang ");
            return true;
        }
            return false;
    }
}
