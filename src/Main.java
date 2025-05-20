import domain.HocSinhDto;
import service.HocSinhService;

public class Main {
    public static void main(String[] args) {
        //Gia dinh da co hoc sinh
        HocSinhDto hocSinhDto = new HocSinhDto();
        hocSinhDto.setName("Nguyen Van A");
        hocSinhDto.setAddress("102 Quang Trung");
        hocSinhDto.setMath(5);
        hocSinhDto.setPhysical(6);
        hocSinhDto.setChemistry(7);

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
