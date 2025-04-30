package loops;

public class NestedLoops {
    public static void main(String[] args) {


        for (int i=1; i<=3; i++){
            System.out.println("i = "+i);

            for (int j=1; j<=2; j++){
                System.out.println("j = "+j);
            }
        }


        for (int i=1; i<4; i++){
            System.out.println("Hello");

            for (int j=1; j<=5; j++){

                System.out.println("Bye");
            }
        }
    }
}
