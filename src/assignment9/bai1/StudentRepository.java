package assignment9.bai1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void inputStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Student> searchStudent(String name) {
        List<Student> result = this.students.stream()
                .filter(student -> student.getStudentName().contains(name))
                .toList();
        return result;
    }
}
