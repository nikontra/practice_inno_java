package OOP.practice.task_1;

//Кусаются
//Могут болеть

public class Animal {
    String name;
    boolean healthy;
    String cage = "в вольере";

    public void bite(Human human) {
        human.hurt = true;
        System.out.println("Животное покусало " + human.profession);
    }
}
