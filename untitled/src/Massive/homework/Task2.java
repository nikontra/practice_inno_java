package Massive.homework;

import static java.util.Arrays.deepToString;

//Вывести элементы массива на экран в обратном порядке.
public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(deepToString(arr));

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
