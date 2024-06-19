package OOP.practice.task_1;

//Может быть голодным и покусаным

//1) обедает
//2) следит за белками
//3) наложить себе повязку

public abstract class Human {
    String profession;
    boolean hungry;
    boolean hurt;

    abstract void lunch();

    void watch(Squirrels squirrels) {
        if (squirrels.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squirrels.cage = "в вольера";
        } else {
            System.out.println("Белка на месте");
        }
    }

    abstract void nakeBandage();
}
