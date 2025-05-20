package emiri;

import java.util.Scanner;

public class bai_tap_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập đểm toán của bạn");
        float i = scanner.nextFloat();

        while (i <= 8){
            System.out.println("Hãy nhập điểm từ điểm 8 trở lên:" );
            i = scanner.nextFloat();
        }
        System.out.println("Điểm toán của bạn là:" + i);
    }
}
