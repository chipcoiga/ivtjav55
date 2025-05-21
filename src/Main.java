import domain.HocSinhDto;
import service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gia dinh da co hoc sinh
        Scanner sc = new Scanner(System.in);
        HocSinhDto hocSinhDto = new HocSinhDto();
        System.out.print("Nhap ten hoc sinh: ");
        hocSinhDto.setName(sc.nextLine());

        System.out.print("Nhap dia chi: ");
        hocSinhDto.setAddress(sc.nextLine());

        System.out.print("Nhap tuoi: ");
        hocSinhDto.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap diem Toan: ");
        hocSinhDto.setMath(Float.parseFloat(sc.nextLine()));

        System.out.print("Nhap diem Ly: ");
        hocSinhDto.setPhysical(Float.parseFloat(sc.nextLine()));

        System.out.print("Nhap diem Hoa: ");
        hocSinhDto.setChemistry(Float.parseFloat(sc.nextLine()));

        HocSinhService service = new HocSinhService();
        boolean isHocSinhValid = service.validateHocSinh(hocSinhDto);

        // if (isHocSinhValid ==false ) {
        if (!isHocSinhValid) {
            System.out.println("Thong tin hoc sinh ko hop le");
            return;
        }

        String hocLuc = service.phanLoaiHocLuc(hocSinhDto);
        String name = hocSinhDto.getName();
        System.out.println("Hoc luc cua Hoc sinh ten "
                + name + " la: " + hocLuc);
    }
}
