package app;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static double f;

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);

        //subtraction
        e = subtract(a, b);
        System.out.println(e);

        //division
        f = division(a, b);
        System.out.printf("%.3f%n", f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return (a - b);
    }

    private static double division(int a, int b) {
        if (b != 0) {
            return ((double) a / b);
        } else {
            return 0;
        }
    }
}
