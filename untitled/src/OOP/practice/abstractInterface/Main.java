package OOP.practice.abstractInterface;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 50;
        human.name = "Вася";
        System.out.println("Имя: " + human.name + "\nВозраст: " + human.age);
        human.eat();
        human.sleep();
        System.out.println();

        Dog dog = new Dog();
        dog.name = "Шарик";
        System.out.println("Имя: " + dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.bite();
        dog.clean();
        System.out.println();

        Doctors doctor = new Doctors();
        doctor.name = "Петр";
        doctor.age = 35;
        System.out.println("Имя: " + doctor.name + "\nВозраст: " + doctor.age);
        doctor.eat();
        doctor.sleep();
        System.out.println();

        Tools tool = new Tools();
        tool.bite();
        tool.clean();
    }
}
