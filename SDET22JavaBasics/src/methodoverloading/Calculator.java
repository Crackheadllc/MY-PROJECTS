package methodoverloading;

public class Calculator {

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(double a, int b) {
        System.out.println(a + b);
    }

    void add(int b, double a) {
        System.out.println(b + a);
    }
}
