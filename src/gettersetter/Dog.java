package gettersetter;

public class Dog extends Animal {
    private String color;

    public Dog() {}
    public Dog(String name) {
        super.setFullname(name);
    }

    public Dog(String name, int age, String color) {
        this.color = color;
        super.setFullname(name);
        super.setAge(age);
    }

    @Override
    public void action() {
        System.out.println("Dog Action");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
