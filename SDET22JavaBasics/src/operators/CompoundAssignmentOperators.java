package operators;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        int result=5;

        result=result+10; //15
        System.out.println(result);

        result+=10;//25
        System.out.println(result);

        result-=20;//5
        System.out.println(result);

        result*=10;//50
        System.out.println(result);

        result/=2;//25
        System.out.println(result);

        result%=4;//1
        System.out.println(result);
    }
}
