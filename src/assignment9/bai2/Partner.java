package assignment9.bai2;

public class Partner extends Person {
    private double salary;
    private int kpi;

    public Partner() {
    }

    public Partner(int personNo, String name, String email, double salary, int kpi) {
        setPersonNo(personNo);
        setName(name);
        setEmail(email);
        this.salary = salary;
        this.kpi = kpi;
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

    public double getActualSalary() {
        return (salary * kpi) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Role: Partner\n" +
                "Base Salary: " + String.format("%.1f", salary) + "\n" +
                "KPI: " + kpi + "\n" +
                "Actual Salary: " + String.format("%.1f", getActualSalary());
    }
}
