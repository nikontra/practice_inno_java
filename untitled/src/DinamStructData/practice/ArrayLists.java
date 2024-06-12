package DinamStructData.practice;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = new int[10];

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Pear");
        myList.add("Grape");
        myList.add("Pineapple");
        myList.add("Watermelon");

        System.out.println(myList);
        System.out.println(myList.get(2));

        myList.add(2,"Melon");
        System.out.println(myList);
        System.out.println(myList.get(2));

        myList.remove(2);
        System.out.println(myList);
        System.out.println(myList.get(2));

        myList.remove("Apple");
        System.out.println(myList);

    }
}

