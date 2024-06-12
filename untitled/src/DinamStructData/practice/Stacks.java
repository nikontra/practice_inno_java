package DinamStructData.practice;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Character> myStack = new Stack<>();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        myStack.push('d');
        myStack.push('e');

        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }
}
