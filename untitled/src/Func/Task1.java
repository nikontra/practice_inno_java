package Func;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        lineStars(n);
    }
    public static void lineStars(int n) {
        if (n > 0) {
            n--;
            System.out.print("*");
            lineStars(n);
        }
    }
}
