package operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1=12;
        int num2=7;

        System.out.println(num1>num2);//true
        System.out.println(num1<num2);//false
        System.out.println(num1==num2);//false

        boolean result=num1!=num2;//true
        System.out.println(result);

        result=num1>=num2;//true
        System.out.println(result);

        result=num1<=num2;//false
        System.out.println(result);


    }
}
