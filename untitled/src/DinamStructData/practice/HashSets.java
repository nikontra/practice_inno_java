package DinamStructData.practice;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Banana");
        System.out.println(mySet);

        mySet.remove("Banana");
        System.out.println(mySet);

        mySet.remove("Banana");
        mySet.add("Banana");
        System.out.println(mySet);


    }
}
