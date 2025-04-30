package introduction;

public class VariableValues {
    public static void main(String[] args) {

        String name, lastname, state; //declaration
        int age=30;
        name="Godwin"; //initialization
        lastname="Don";
        state="WA";

        System.out.println(name);
        System.out.println(lastname);
        System.out.println(state);
        System.out.println(age);

        lastname="Monday"; //reassigning values
        age=31;
        state="CA";

        System.out.println(lastname);
        System.out.println(age);
        System.out.println(state);
    }
}
