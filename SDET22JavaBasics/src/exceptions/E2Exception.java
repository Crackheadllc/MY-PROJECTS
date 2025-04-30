package exceptions;

public class E2Exception {
    public static void main(String[] args) {

        System.out.println(1);

        try {
            String name = null;
            System.out.println(name.length());
            //System.out.println(10 / 0);

        }
        catch (NullPointerException npe){
            npe.printStackTrace();
            //System.out.println("Please initialize the object");
        }
             catch (ArithmeticException e) {
            e.printStackTrace();
                //System.out.println("This Math operation is not allowed");
        }
        catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Something went wrong");
        }
        System.out.println(6);


    }
}




