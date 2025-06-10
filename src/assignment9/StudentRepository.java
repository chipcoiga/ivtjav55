package assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void inputStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }
}
