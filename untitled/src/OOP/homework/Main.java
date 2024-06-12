package OOP.homework;

import static OOP.homework.Phone.receiveCall;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("samsung galaxy", "+987456321", 230.0);

        Phone phone2 = new Phone("xiaomi redmi", "+987456321", 235.0);

        Phone phone3 = new Phone();
        phone3.setModel("iphone 14");
        phone3.setNumber("+987456321");
        phone3.setWeight(240.0);

        System.out.printf("Телефон %s с номером %s имеет вес %.1fг.\n", phone1.getModel(), phone1.getNumber(), phone1.getWeight());
        System.out.printf("Телефон %s с номером %s имеет вес %.1fг.\n", phone2.getModel(), phone2.getNumber(), phone2.getWeight());
        System.out.printf("Телефон %s с номером %s имеет вес %.1fг.\n", phone3.getModel(), phone3.getNumber(), phone3.getWeight());

        receiveCall("Василий");
        receiveCall("Иван");
    }
}

