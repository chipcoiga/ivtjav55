package gettersetter;

public abstract class Animal {
    private String fullname;
    private int age;

    public abstract void action();

    public void countNumber() {
        System.out.println("Show count number");
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
