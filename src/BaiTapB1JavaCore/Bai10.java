package BaiTapB1JavaCore;

import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int number = scanner.nextInt();

            sum += number;

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Tổng các số vừa nhập là: " + sum);
        System.out.println("Số lớn nhất trong dãy là: " + max);

        scanner.close();
    }
}

