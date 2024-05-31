package Cycle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int count = 10;
////        while (count < 30) {
////            System.out.println(count);
////            count ++;
////        }
//        do {
//            System.out.println(count);
//            count ++;
//        } while (count < 30);

        Scanner input = new Scanner(System.in);
//
//        int number = 0;
//        int counter = 0;
//        int sum = 0;
//        do {
//            number = input.nextInt();
//            counter ++;
//            sum += number;
//        } while (number != 0);
//        System.out.println(counter);
//        System.out.println(sum);

        int number = input.nextInt();

        int max = 0;
        int min = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            number = number / 10;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
