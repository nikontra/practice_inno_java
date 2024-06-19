package OOP.practice.car;

//Напишите программу с классом Car.
//● Создайте конструктор класса Car.
//        ● Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
//        ● Напишите пять методов:
//        ○ Первый — запуск автомобиля, при его вызове выводится сообщение
//«Автомобиль заведен».
//        ○ Второй — отключение автомобиля — выводит сообщение «Автомобиль
//заглушен».
//        ○ Третий — присвоение автомобилю года выпуска.
//        ○ Четвертый метод — присвоение автомобилю типа.
//○ Пятый — присвоение автомобилю цвета.

public class Car {
    private String color;
    private String type;
    private int year;
    public Car(String color, String type, int year) {
        this.color = color;
        this.type = type;
        this.year = year;
        message();
        autoStart();
        autoStop();
    }
    public Car() {
        message();
        autoStart();
        autoStop();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public static void message(){
        System.out.println("Автомобиль создан");
    }
    public static void autoStart(){
        System.out.println("Автомобиль заведен!");
    }
    public static void autoStop(){
        System.out.println("Автомобиль заглушен!");
    }
}
