package Func;

public class Func {
    public static void main(String[] args) {
//        int number = 5;
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        printNumberToLine(number);
//        printNumberToLine(number);
//        printNumberToLine(number);
//        printNumberToLine(number);

//        System.out.println(greaterThan5(num));

//        int count = 5;
//        printToPyramids(num, count);
        lineToTable(1,1);


    }
//
//    public static void printNumberToLine(int n) {
//        System.out.printf("%d %d %d %d %d %d \n", n, n, n, n, n, n);
//    }
//
//    public static boolean greaterThan5(int a) {
//        boolean result = true;
//        if (a < 5) {
//            result = false;
//        }
//        return result;
//    }
//    public static void printToPyramids (int n, int count) {
//        if (count > 0) {
//            count--;
//            System.out.print(n + " ");
//            printToPyramids(n, count);
//        }
//    }
    public static void lineToTable (int a, int b) {
        if (a <= 9) {
            printTable(a, b);
            System.out.println();
            a++;
            lineToTable(a, b);
        }
    }

    public static void printTable (int a, int b) {
        if (b <= 9) {
            System.out.printf("%d + %d = %d  ", a, b, a+b);
            b++;
            printTable(a, b);
        }
    }
}