package validater;


import validater.domain.HocSinhDto;

public class AgeValidate implements HocSinhValidater{

    private HocSinhDto dto;
    public AgeValidate(HocSinhDto dto){
        this.dto = dto;
    }
    @Override
    public void validate() {
        int age = dto.getAge();

        if(age < 15 || age >18){
            System.out.println("Tuổi không hợp lệ");
        }else {
            System.out.println("Tuổi hợp lệ");
        }
    }
}
//a
