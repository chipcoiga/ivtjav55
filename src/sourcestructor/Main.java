package sourcestructor;

import exceptiondemo.DivZeroException;
import sourcestructor.dto.Student;
import sourcestructor.repository.HocSinhRepository;
import sourcestructor.service.HocSinhService;

public class Main {
    public static void main(String[] args) throws DivZeroException {
        Student student = new Student("ST1", "HIHI", 20);

        HocSinhRepository repository = new HocSinhRepository();
        HocSinhService service = new HocSinhService(repository);
        service.saveStudent(student);

        //
    }
}
