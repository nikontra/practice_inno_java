package OOP.practice.abstractInterface;

public class Tools implements Behavior{
    public boolean clean() {
        System.out.println("Мыть инструмент");
        return true;
    }
}
