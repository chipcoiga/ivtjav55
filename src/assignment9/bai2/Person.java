package assignment9.bai2;

public class Person {
    private int personNo;
    private String name;
    private String email;

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "No: " + personNo + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email;
    }
}
