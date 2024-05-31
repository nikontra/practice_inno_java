package Func;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите через пробел стороны первого треугольника");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Введите через пробел стороны второго треугольника");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (validTriangle(a, b, c) && validTriangle(x, y, z)) {

            int perimeter1 = perimeterTriangle(a, b, c);
            int perimeter2 = perimeterTriangle(x, y, z);

            double square1 = squareTriangle(a, b, c);
            double square2 = squareTriangle(x, y, z);

            System.out.println("Сумма периметров: " + (perimeter1 + perimeter2));
            System.out.println("Сумма площадей: " + (square1 + square2));
        } else {
            System.out.println("Стороны указаны не верно!");
        }
    }

    public static int perimeterTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static double squareTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean validTriangle(int a, int b, int c) {
        boolean result = false;
        if (a+b>c && a+c>b && c+b>a) {
            result = true;
        }
        return result;
    }
}
