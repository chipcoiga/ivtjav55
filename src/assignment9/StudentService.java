package assignment9;

import java.util.*;

public class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void createStudent() {
        System.out.println("Nhap thong tin student: ");
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID");
        int studentId = scanner.nextInt();
        student.setStudentId(studentId);

        scanner.nextLine();
        System.out.println("Nhap name");
        String name = scanner.nextLine();
        student.setStudentName(name);

        System.out.println("Nhap batch");
        String batch = scanner.nextLine();
        student.setBatch(batch);

        System.out.println("Nhap mark1");
        float mark1 = scanner.nextFloat();
        student.setMark1(mark1);

        System.out.println("Nhap mark2");
        float mark2 = scanner.nextFloat();
        student.setMark2(mark2);

        repository.inputStudent(student);
    }

    public void printAllStudents() {
        List<Student> students = repository.getStudents();

        for(Student student : students) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Batch: " + student.getBatch());
            System.out.println("Mark1: " + student.getMark1());
            System.out.println("Mark2: " + student.getMark2());
            System.out.println("================");
        }
    }

    public void printAllStudentAverageMark() {
        List<Student> students = repository.getStudents();

        for(Student student : students) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("AVG mark: " + student.getAverageMark());
            System.out.println("================");
        }
    }

    public void printSortedStudents() {
        List<Student> students = repository.getStudents();

        students.sort(Comparator.comparing(Student::getAverageMark));

        for(Student student : students) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("AVG mark: " + student.getAverageMark());
            System.out.println("================");
        }
    }

    public void searchStudentByName(String name) {
        List<Student> students = repository.searchStudent(name);

        System.out.println("tim thay " + students.size() + " students");
        for(Student student : students) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Batch: " + student.getBatch());
            System.out.println("Mark1: " + student.getMark1());
            System.out.println("Mark2: " + student.getMark2());
            System.out.println("================");
        }
    }
}
