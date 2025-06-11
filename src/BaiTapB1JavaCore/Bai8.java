package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số từ 1 đến 7: ");
        int number = scanner.nextInt();

        String day;

        switch (number) {
            case 1:
                day = "Chủ nhật";
                break;
            case 2:
                day = "Thứ hai";
                break;
            case 3:
                day = "Thứ ba";
                break;
            case 4:
                day = "Thứ tư";
                break;
            case 5:
                day = "Thứ năm";
                break;
            case 6:
                day = "Thứ sáu";
                break;
            case 7:
                day = "Thứ bảy";
                break;
            default:
                day = "Số không hợp lệ. Vui lòng nhập từ 1 đến 7.";
        }

        System.out.println("Kết quả: " + day);
        scanner.close();
    }
}

