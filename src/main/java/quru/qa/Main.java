package quru.qa;

public class Main {
    public static void main(String[] args) {
        String message = "Hello qa.quru!";
        int a = 2;
        int b = 5;
        int c = 3;
        int d = 100;
        boolean bool = true;
        boolean fBool = false;
        byte aByte = 127;
        byte bByte = 1;
        short aShort = -32768;
        long aLong = 9223372036854775807L;
        float aFloat = 1.1F;
        double aDouble = 1.0;
        char aChar = 'a';
        System.out.println("a+b = " + (a+b));
        System.out.println("c-b = " + (c-b));
        System.out.println("a/b = " + (a/b));
        System.out.println("c*b = " + (c*b));
        System.out.println("b%a = " + (b%a));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));
        System.out.println("b++ = " + (b++));
        System.out.println("++b = " + (++b));
        System.out.println("Double * a int = " + (aDouble*a));
        System.out.println("a int/Double = " + (a/aDouble));
        System.out.println(++aByte); //128-256 = -128
        System.out.println(++aLong);
        System.out.println(--aShort); //
        System.out.println("long + int = " + (aLong+a));
        System.out.println("long - int = " + (aLong-d));

    }
}
