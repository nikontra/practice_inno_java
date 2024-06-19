package OOP.practice.abstractInterface;

public class Human extends Animal {
    int age;

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }

    @Override
    public void sleep() {
        System.out.println("Человек спит");
    }
}
