package com.demo.javcore.helper;

public class StringHelper {
    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Input bị null");
            return true;  // sửa: trả về true khi null
        }

        if (input.equals("")) {
            System.out.println("Input bị empty");
            return true;  // sửa: trả về true khi chuỗi rỗng
        }

        String addressStrim = input.replaceAll(" ", "");
        if (addressStrim.equals("")) {
            System.out.println("Input bị empty");
            return true;  // sửa: trả về true khi chỉ toàn khoảng trắng
        }

        return false;  // chuỗi hợp lệ, không rỗng
    }
}
