package OOP.practice.abstractInterface;

public interface Behavior {
    default void bite () {
        System.out.println("Кусает");
    }
    boolean clean ();
}
