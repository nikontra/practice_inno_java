package DinamStructData.practice;

//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//Избавиться от повторяющихся элементов в строке.
//Вывести результат на экран.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через запятую");
//        String example = "1, 2, 3, 4, 4, 5";
//        String[] array = example.split(".*,.*");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        HashSet<Integer> list = new HashSet<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
