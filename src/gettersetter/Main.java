package gettersetter;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        Dog dog = new Dog();
        dog.setFullname("Dog");
        dog.setAge(100);
        dog.setColor("RED");
        animals[0] = dog;

        Cat cat = new Cat();
        cat.setFullname("Cat");
        cat.setAge(40);
        cat.setGender("MALE");
        animals[1] = cat;

        Duck duck = new Duck();
        duck.setFullname("Duck");
        duck.setAge(30);
        duck.setSwim(true);
        animals[2] = duck;

        findAgeLessThan50(animals);
    }

    private static void findAgeLessThan50(Animal[] animals) {
        for(Animal animal : animals) {
            if (animal.getAge() < 50) {
                System.out.println(animal.getFullname());

                if (animal instanceof Cat) {
                    Cat cat = (Cat) animal;
                    System.out.println(cat.getGender());
                } else if (animal instanceof Duck) {
                    Duck duck = (Duck) animal;
                    System.out.println(duck.isSwim());
                } else if (animal instanceof Dog) {
                    Dog dog = (Dog) animal;
                    System.out.println(dog.getColor());
                }
            }
        }
    }
}
