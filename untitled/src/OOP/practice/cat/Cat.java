package OOP.practice.cat;

public class Cat {
    private String name;
    private int age;
    boolean hungry = true;
    static int count = 0;
//конструкторы
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        countCats();
    }
    public Cat() {
        countCats();
    }
//сеттеры
    public void setName(String name) {
        if (name != "") {
            this.name = name;
        }
    }
    public void setAge(int age) {
        this.age = age;
    }
//геттеры
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
//методы
    private void meow() {
        System.out.println("Мяу!");
    }

    public void wantToOut() {
        System.out.println("Скребет дверь");
        meow();
    }
//статические методы
    public static void countCats() {
        count++;
        System.out.println("Создана кошка номер " + count);
    }


}
