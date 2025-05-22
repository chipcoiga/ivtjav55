package Configuration;

import domain.HocSinhDto;
import service.HocSinhService;

import java.util.Scanner;

public class InputInformation {

    public static void main(String[] args) {
        HocSinhDto hocSinh = new HocSinhDto();
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.println("nhap ten: ");
            hocSinh.setName(scanner.nextLine());
            scanner.nextLine();
            System.out.println("nhap dia chi: ");
            hocSinh.setAddress(scanner.nextLine());

            System.out.println("nhap tuoi: ");
            hocSinh.setAge(scanner.nextInt());
            System.out.println("nhap diem toan: ");
            hocSinh.setMath( scanner.nextFloat());
            System.out.println("nhap diem ly: ");
            hocSinh.setPhysical(scanner.nextFloat());
            System.out.println("nhap diem hoa: ");
            hocSinh.setChemistry(scanner.nextFloat());

            HocSinhService handleResult = new HocSinhService();
            String result = handleResult.phanLoaiHocLuc(hocSinh);
            System.out.println(result);
            boolean handleValidateName = handleResult.validateHocSinh(hocSinh);
            boolean handleNumber = handleResult.validNumber(hocSinh);

            System.out.println("continue? (y/n): ");

            choice = scanner.next();
            System.out.println();



        }
    }
}
