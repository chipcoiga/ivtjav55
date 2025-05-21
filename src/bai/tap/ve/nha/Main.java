package bai.tap.ve.nha;

import bai.tap.ve.nha.domain.HocSinhDto;
import bai.tap.ve.nha.service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        HocSinhDto hocSinhDto = new HocSinhDto();
        HocSinhService service = new HocSinhService();

        System.out.println("Nhập tên học sinh:");
        hocSinhDto.setName(scanner.nextLine());

        System.out.println("Nhập địa chỉ:");
        hocSinhDto.setAddress(scanner.nextLine());

        if (!service.validateHocSinh(hocSinhDto)) {
            System.out.println("Thông tin học sinh không hợp lệ.");
            return;
        }

        System.out.println("Nhập tuổi:");
        hocSinhDto.setAge(scanner.nextInt());

        System.out.println("Nhập điểm Toán:");
        hocSinhDto.setMath(scanner.nextFloat());

        System.out.println("Nhập điểm Lý:");
        hocSinhDto.setPhysical(scanner.nextFloat());

        System.out.println("Nhập điểm Hóa:");
        hocSinhDto.setChemistry(scanner.nextFloat());



        String hocLuc = service.phanLoaiHocLuc(hocSinhDto);
        System.out.println("====== Kết quả ======");
        System.out.println("Nhập tên: " + hocSinhDto.getName());
        System.out.println("Nhập địa chỉ: " + hocSinhDto.getAddress());
        System.out.println("Nhập tuổi: " + hocSinhDto.getAge());
        System.out.println("Nhập điểm TB: " + hocSinhDto.getAverage());
        System.out.println("Học lực: " + hocLuc);
    }
}
