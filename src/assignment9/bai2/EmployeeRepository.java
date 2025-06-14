package assignment9.bai2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}
