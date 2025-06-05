package validator;

public class thongtinhocsinh extends StudentValidator {

    @Override
    public boolean isValid(Student student) {
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            errorMessage = "Tên không được để trống.";
            return false;
        }

        if (student.getAge() < 15 || student.getAge() > 18) {
            errorMessage = "Tuổi phải từ 15 đến 18.";
            return false;
        }

        if (student.getScore() < 0 || student.getScore() > 10) {
            errorMessage = "Điểm phải từ 0 đến 10.";
            return false;
        }

        return true;
    }
}