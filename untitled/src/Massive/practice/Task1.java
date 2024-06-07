package Massive.practice;

//Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в
//ходе выполнения программы.
//Дан массив. Составить программу:
//    1. расчета квадратного корня из любого элемента массива;
//    2. расчета среднего арифметического двух любых элементов массива

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
//        System.out.println("Введите десять чисел через пробел");

        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
            arr[i] = random.nextInt(10);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d ", arr[i]);
//        }
        System.out.println(deepToString(arr));
        int randomIndex = random.nextInt(arr.length);
        double sqrt = sqrtElement(arr[randomIndex]);
        System.out.printf("Элемент массива %d, корень из этого элемента %f\n", arr[randomIndex], sqrt);

        int randomIndex2 = random.nextInt(arr.length);
        int randomIndex3 = random.nextInt(arr.length);
        double awgTwoElement = awgTwoElement(arr[randomIndex2], arr[randomIndex3] );
        System.out.printf("Среднее арифметическое элементов %d и %d равно %f\n", arr[randomIndex2], arr[randomIndex3], awgTwoElement);
    }

    public static double sqrtElement(int element) {
            return Math.sqrt(element);
        }

    public static double awgTwoElement(float a, float b) {
        return (a + b)/2;
    }

}
