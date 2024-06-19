package OOP.practice.car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car("Синий", "Седан", 2005);
        audi.setColor("Белый");
        audi.setYear(2009);
        audi.setType("Джип");
    }
}
