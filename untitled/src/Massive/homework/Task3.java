package Massive.homework;
//Определить:
// 1.сумму всех элементов массива;
// 2.произведение всех элементов массива;
// 3.сумму квадратов всех элементов массива;
// 4.сумму шести первых элементов массива

import static java.util.Arrays.deepToString;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(deepToString(arr));

        int sumElements = 0;
        int multipliElements = 1;
        int sumPowElements = 0;
        int sumToSixElements = 0;

        for (int i = 0; i < arr.length; i++) {
            sumElements += arr[i];
            multipliElements *= arr[i];
            sumPowElements += Math.pow(arr[i], 2);
            if (i < 6) {
                sumToSixElements += arr[i];
            }
        }
        System.out.printf("%d\n%d\n%d\n%d\n", sumElements, multipliElements, sumPowElements, sumToSixElements);
    }

}
