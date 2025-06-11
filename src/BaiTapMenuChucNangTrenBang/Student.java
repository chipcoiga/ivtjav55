package BaiTapMenuChucNangTrenBang;

public class Student {
    private String name;
    private double math;
    private double physics;
    private double chemistry;

    public Student(String name, double math, double physics, double chemistry) {
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return (math + physics + chemistry) / 3;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 8.0) return "Giỏi";
        else if (avg >= 6.5) return "Khá";
        else if (avg >= 5.0) return "Trung bình";
        else return "Yếu";
    }

    public String getName() {
        return name;
    }

    public double getMath() { return math; }

    public double getPhysics() { return physics; }

    public double getChemistry() { return chemistry; }
}

