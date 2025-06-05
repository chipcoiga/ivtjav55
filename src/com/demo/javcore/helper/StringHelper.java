package com.demo.javcore.helper;

public class StringHelper {
    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Input bi null");
            return true;
        }

        if (input.equals("")) {
            System.out.println("Input bi empty");
            return true;
        }

        String addressStrim = input.replaceAll(" ", "");
        if (addressStrim.equals("")) {
            System.out.println("Input bi empty");
            return true;
        }

        return false;
    }
}
