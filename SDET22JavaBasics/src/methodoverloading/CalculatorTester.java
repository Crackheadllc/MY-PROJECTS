package methodoverloading;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(10,20,30);
        c.add(20.5,10.5);
        c.add(20,20.5);
        System.out.println(10);
        System.out.println(10.5);
        System.out.println(false);
        System.out.println('c');
        System.out.println("10");
    }
}
