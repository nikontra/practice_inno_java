package OOP.practice.task_1;


//1) обходит каждое животное и проверяет его здоровье
//2) помещает его в карантин, изолируя от других животных
//3) возвращает животное в обычный вольер


import OOP.practice.abstractInterface.Dog;

public class Veterinarian extends Human {

    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Ветеринар пообедал");
            hungry = false;
        } else {
            System.out.println("Ветеринар не голоден");
        }
    }

    @Override
    void nakeBandage() {
        if (hurt) {
            System.out.println("Ветеринар накладывает себе повязку");
            hurt = false;
        } else {
            System.out.println("Ветеринара не кусали");
        }
    }
    public Veterinarian() {
        this.profession = "Ветеринар";
    }

    public void checkHealth(Animal animal) {
        if (!animal.healthy) {
            animal.cage = "в карантине";
            System.out.println(animal.name + "помещено в карантин");
        }
        if (animal.cage == "в карантине" && animal.healthy) {
            animal.cage = "в клетке";
            System.out.println(animal.name + "выздоровело");
        }
    }

}
