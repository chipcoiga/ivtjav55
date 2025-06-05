package validater;


import validater.domain.HocSinhDto;

public class NameValidate implements HocSinhValidater{

    private HocSinhDto dto;
    public NameValidate(HocSinhDto dto){
        this.dto = dto;
    }
    @Override
    public void validate() {
        String name  = dto.getName() ;
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Tên bị không hợp lê ");
        } else {
            System.out.println("Tên hợp lệ");
        }

    }
}
