package conditionalstatements;

public class SwitchStatement {
    public static void main(String[] args) {


        String choice="soda";

        switch (choice){

            case "water":
                System.out.println("Dispensing water");
                break;
            case "soda":
                System.out.println("Dispensing soda");
                break;
            case "juice":
                System.out.println("Dispensing juice");
                break;
            case "cofee":
                System.out.println("Dispensing coffe");
                break;
            default:
                System.out.println("Your drink is not available");
                break;

        }
    }
}
