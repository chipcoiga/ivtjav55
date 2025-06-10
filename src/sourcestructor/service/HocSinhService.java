package sourcestructor.service;

import exceptiondemo.DivZeroException;
import sourcestructor.dto.Student;
import sourcestructor.repository.HocSinhRepository;

public class HocSinhService {
    private final HocSinhRepository repository;

    public HocSinhService(HocSinhRepository repository) {
        this.repository = repository;
    }

    public void saveStudent(Student student) throws DivZeroException {
        validate(student);
        repository.save(student);
    }

    private void validate(Student student) throws DivZeroException {
        if (student.getAge() > 100) {
            throw new DivZeroException("Tuoi qua lon");
        }
    }
}
