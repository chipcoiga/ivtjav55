package src.javcore.domain;

import src.javcore.domain.domain.HocSinhDto;
import src.javcore.domain.service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HocSinhDto hocSinhDto = new HocSinhDto();
        HocSinhService service = new HocSinhService();

        System.out.print("Nhập tên học sinh: ");
        hocSinhDto.setName(scanner.nextLine());

        System.out.print("Nhập địa chỉ: ");
        hocSinhDto.setAddress(scanner.nextLine());

        System.out.print("Nhập tuổi: ");
        hocSinhDto.setAge(scanner.nextInt());

        System.out.print("Nhập điểm Toán: ");
        hocSinhDto.setMath(scanner.nextFloat());

        System.out.print("Nhập điểm Lý: ");
        hocSinhDto.setPhysical(scanner.nextFloat());

        System.out.print("Nhập điểm Hóa: ");
        hocSinhDto.setChemistry(scanner.nextFloat());


        String hocLuc = service.phanLoaiHocLuc(hocSinhDto);
        System.out.println("Học lực của học sinh tên " +
                hocSinhDto.getName() + " là: " + hocLuc);
    }
}