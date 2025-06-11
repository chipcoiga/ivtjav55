package BaiTapB1JavaCore;

import java.util.Scanner;
import java.util.Random;

public class Bai11 {
    public static void main(String[] args) {
        Random random = new Random();
        int soMayTinh = random.nextInt(100) + 1; // Tạo số từ 1 đến 100
        Scanner scanner = new Scanner(System.in);

        int doan;
        int soLanDoan = 0;

        System.out.println("Chào mừng đến với trò chơi đoán số!");
        System.out.println("Máy tính đã chọn 1 số từ 1 đến 100. Hãy thử đoán!");

        do {
            System.out.print("Nhập số bạn đoán: ");
            doan = scanner.nextInt();
            soLanDoan++;

            if (doan < soMayTinh) {
                System.out.println("Số bạn đoán nhỏ hơn!");
            } else if (doan > soMayTinh) {
                System.out.println("Số bạn đoán lớn hơn!");
            } else {
                System.out.println("Chúc mừng! Bạn đã đoán đúng!");
                System.out.println("Bạn đã đoán tổng cộng " + soLanDoan + " lần.");
            }
        } while (doan != soMayTinh);

        scanner.close();
    }
}
