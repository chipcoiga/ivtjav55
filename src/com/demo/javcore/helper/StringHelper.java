package com.demo.javcore.helper;

public class StringHelper {

    /**
     * Kiểm tra chuỗi có blank hay không
     * Blank nghĩa là:
     * - null
     * - rỗng ""
     * - chỉ chứa các ký tự khoảng trắng: space, tab, newline,...
     *
     * @param input Chuỗi cần kiểm tra
     * @return true nếu blank, false nếu không blank
     */
    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Input bị null");
            return true;
        }

        // trim() loại bỏ khoảng trắng đầu và cuối (space, tab, newline,...)
        if (input.trim().isEmpty()) {
            System.out.println("Input bị empty hoặc chỉ chứa khoảng trắng");
            return true;
        }

        return false; // chuỗi có ký tự hợp lệ
    }
}
