package conditionalstatements;

public class MoreNestedIf {
    public static void main(String[] args) {

        boolean member=false;
        double purchaseAmount=20;

        if(member){

            if ( purchaseAmount>100){
                System.out.println("Your discount is 15%");
            }else {
                System.out.println("Discount is 10%");

            }

        }else {

            if ( purchaseAmount>100 ){
                System.out.println("Your discount is 5%");
            }else {
                System.out.println("There is no discount for non members");
            }

        }
    }
}
