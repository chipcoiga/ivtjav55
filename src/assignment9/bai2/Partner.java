package assignment9.bai2;

public class Partner extends Person {
    private double salary;
    private int kpi;

    public double getActualSalary() {
        return (salary * kpi) / 100;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }
}
