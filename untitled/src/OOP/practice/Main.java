package OOP.practice;

import static OOP.practice.Cat.count;
import static OOP.practice.Cat.countCats;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка", 5);
        cat1.hungry = false;
        System.out.println(cat1.hungry);
        System.out.println("Имя кошки: " + cat1.getName());
        System.out.println("Возраст " + cat1.getAge());

        cat1.wantToOut();
        System.out.println();

        Cat cat2 = new Cat();
        cat2.setName("Мурзик");
        cat2.setAge(6);
        cat2.hungry = false;
        System.out.println(cat2.hungry);
        System.out.println("Имя кошки: " + cat2.getName());
        System.out.println("Возраст " + cat2.getAge());
        cat2.wantToOut();
        System.out.println();

        System.out.println("Число кошек " + count);
        countCats();
        System.out.println("Число кошек " + count);
    }
}
