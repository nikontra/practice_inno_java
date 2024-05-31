import org.w3c.dom.ls.LSOutput;

public class Demo {
    public static void main(String[] args) {
        int number = 5;
        short digit = 1;
        digit = 3;
        digit = 'c';
        System.out.println(digit);
//        digit = 123456;
        final String string = "Hello World";
//        string = "Hi!"
        byte byteValue = 127;
        int intValue = 1235;
        long longValue = 123L;
        System.out.println(longValue);
        char charValue = 'd';
        String stringValue = "Hello World";
        boolean booleanValue = true;
        double doubleValue = 123.45d;
        float floatValue = 123.45f;

        int sum = 2+2;
        int del = 5/2;
        System.out.println(del);
        int del_2 = 5%2;
        System.out.println(del_2);

        int increment = 1;
        increment++;
        System.out.println(++increment);
        System.out.println(increment++);

        System.out.println("Hi!");
        System.out.print("Hi!"+" ");
        System.out.println("Hi!");
        System.out.println(number + " ");
        System.out.printf("sdfsdrg %d gfdg %.2f sdfrsg %s guyg %c \n", 90, 233.2, "grg", charValue);

        double res = 5.0/4;
        System.out.println(res);
        double i = 2.75;
        double x = i+res;
        int y = (int) x;
        System.out.println(y);



    }
}
