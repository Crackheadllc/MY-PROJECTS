package conditionalstatements;

public class LogicalOr {
    public static void main(String[] args) {


        boolean rain=false;
        boolean cold=true;

        if (rain || cold){
            System.out.println("I am staying home and learning Java");

        }else  {
            System.out.println("I will go for a walk");
        }
    }
}
