package DinamStructData.practice;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Double> myDeque = new ArrayDeque<>();

        myDeque.add(5.3);
        myDeque.add(5.2);
        myDeque.add(1.2);

        System.out.println(myDeque);

        System.out.println(myDeque.pop());
        System.out.println(myDeque);

        System.out.println(myDeque.peek());
        System.out.println(myDeque);

        System.out.println(myDeque.poll());
        System.out.println(myDeque);

        System.out.println(myDeque.pop());
        System.out.println(myDeque);
        System.out.println(myDeque.poll());
    }
}
