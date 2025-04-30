package methods;

public class PrinterTester {
    public static void main(String[] args) {
        Printer printer=new Printer();
        //printer.print();
    //printer.printWord("Hello Syntax");
    printer.printMany("Java",10);
    int sum= printer.add(10,10);
        System.out.println(sum);

        boolean results= printer.isEven(10);
        System.out.println(results);

        int[] arr={10,20,30};

        int sumOfArray= printer.sumArray(arr);
        System.out.println(sumOfArray);
    }
}
