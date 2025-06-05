package gettersetter;

public class Cat extends Animal {
    private String gender;

    @Override
    public void action() {
        System.out.println("Cat Action");
        countNumber();
    }

    public void action(int count) {
        System.out.println("Cat Action: " + count);
    }

    public void action(int count, String x) {
        System.out.println("Cat Action: " + count);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
