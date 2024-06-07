package Massive.practice;

import java.util.Random;

import static java.util.Arrays.deepToString;

//3. Дан массив. Определить:
//    1. максимальный элемент
//    2. минимальный элемент
//    3. индекс максимального элемента
//    4. индекс минимального элемента
//    5. Поменять местами максимальный элемент с минимальным
public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        Integer[] arr = new Integer[r.nextInt(4,10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-100,100);
        }
        System.out.println(deepToString(arr));
        int indexMinElement = minElement(arr);
        int indexMaxElement = maxElement(arr);
        System.out.printf("Минимальный элемент %d \nИндекс минимального элемента %d \n", arr[indexMinElement], indexMinElement);
        System.out.printf("Максимальный элемент %d \nИндекс максимального элемента %d \n", arr[indexMaxElement], indexMaxElement);
        Integer[] replaceElements = replaceElements(arr, indexMinElement, indexMaxElement);
        System.out.println(deepToString(replaceElements));
    }

    public static int minElement(Integer[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int maxElement(Integer[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static Integer[] replaceElements(Integer[] arr, int indexMin, int indexMax) {
        int c = arr[indexMin];
        arr[indexMin] = arr[indexMax];
        arr[indexMax] = c;
        return arr;
    }
}
