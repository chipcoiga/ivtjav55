package assignment9.bai2;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List<Person> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void add(Partner partner) {
        employees.add(partner);
    }

    public List<Person> getEmployees() {
        return employees;
    }
}
