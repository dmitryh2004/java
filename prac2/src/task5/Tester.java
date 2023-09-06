package task5;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Джек", 2));
        dogs.add(new Dog("Бобик", 4));
        dogs.add(new Dog("Полкан", 1));
        System.out.println(dogs);
        System.out.println(dogs.get(1).getHumanAge());
        System.out.println(dogs.get(2).getAge());
        System.out.println(dogs.get(0).getName());
    }
}
