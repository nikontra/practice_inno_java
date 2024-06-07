package Massive.homework;

import static java.util.Arrays.deepToString;

//Заполнить массив из двенадцати элементов 1,2,...12.
public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(deepToString(arr));
    }
}
