package Cycle;

public class Task3 {
    public static void main(String[] args) {
        int numberStart = 1;
        final int correctionWeight = 453;

        do {
            if (numberStart == 1) {
                System.out.printf("%d фунт = %dг.\n", numberStart, correctionWeight+numberStart-1);
            } else if (1 < numberStart && numberStart < 5) {
                System.out.printf("%d фунта = %dг.\n", numberStart, correctionWeight+numberStart-1);
            } else {
                System.out.printf("%d фунтов = %dг.\n", numberStart, correctionWeight+numberStart-1);
            }
            numberStart++;
        } while (numberStart <= 10);
    }
}
