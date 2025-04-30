package loops;

public class MoreNestedLoops {
    public static void main(String[] args) {


        //printing multiplication table

        for (int i=1; i<=10; i++) {

            for (int j=1; j<=10; j++){


                System.out.println(i+" x "+j+" = "+i*j);
            }
        }

        for (int i=1; i<=3; i++){

            System.out.println("I am outer loop");

            for (int j=1; j<=4; j++){

                System.out.println("I am inner loop");
                break;
            }

            break;
        }
    }
}
