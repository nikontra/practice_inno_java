package OOP.practice.task_1;

//1) кормит всех животных
//2) кошачьих вычесывает
//3) меняет бегемоту воду

public class Zookeeper extends Human {

    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Смотритель пообедал");
            hungry = false;
        } else {
            System.out.println("Смотритель не голоден");
        }
    }

    @Override
    void nakeBandage() {
        if (hurt) {
            System.out.println("Смотритель накладывает себе повязку");
            hurt = false;
        } else {
            System.out.println("Смотрителя не кусали");
        }
    }
    public Zookeeper() {
        this.profession = "Смотритель";
    }
}
