package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);

        //subtraction
        int e = subtract(a, b);
        System.out.println(e);

        //division
        double f = division(a, b);
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
