package Massive;

 public class Alishev {
    public static void main(String[] args) {
        int number = 10;
        char character = 'a';
        String s = "abc";
        String s1 = new String("Hello World");

        int[] numbers = new int[5];
        System.out.println(numbers[2]);

        String[] words = new String[5];
        System.out.println(words[2]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers2 = {1,2,3,4,5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
