package validater;
import validater.domain.HocSinhDto;
public class PointValidate implements HocSinhValidater {
    private HocSinhDto dto;
    public PointValidate(HocSinhDto dto){
        this.dto = dto;
    }
    @Override
    public void validate() {
        float math = dto.getMath();
        float physical = dto.getPhysical();
        float chemistry =dto.getChemistry();
        if (math < 0 || math > 10 || physical < 0 || physical > 10 || chemistry < 0 || chemistry > 10 ){
            System.out.println("Bạn đã nhập sai điểm ( 0 - 10)");
        }else {
            System.out.println("nhập điểm thành công");
        }
    }
}//a
