package conditionalstatements;

public class LogicalNot {
    public static void main(String[] args) {


        boolean a=true;
        boolean b=false;

        System.out.println(!a);
        System.out.println(!b);

        boolean study=false;

        if ( !study ){
            System.out.println("I am not going to like Java");
        }
    }
}
