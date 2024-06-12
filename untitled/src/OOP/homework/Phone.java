package OOP.homework;

class Phone {
    private String number;
    private String model;
    private double weight;
//Сеттеры
    public void setNumber(String number) {
        this.number = number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
//Геттеры
    public double getWeight() {
        return weight;
    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
//Конструктор
    public Phone(String model, String number, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
//    Конструктор по умолчанию
    public Phone() {}
//Статический метод
    public static void receiveCall (String name) {
        System.out.printf("Звонит: %s\n", name);
    }
}

