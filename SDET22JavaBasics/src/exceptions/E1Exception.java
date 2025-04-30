package exceptions;

public class E1Exception {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("This Math operation is not allowed");
        }
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

    }
}




