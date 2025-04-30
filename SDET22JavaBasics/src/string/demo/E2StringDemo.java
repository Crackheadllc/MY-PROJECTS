package string.demo;

public class E2StringDemo {
    public static void main(String[] args) {

        String s="";
        System.out.println(s.isEmpty());
        boolean cond=s.isEmpty();

        if (cond){
            System.out.println("The String is empty");
        }else {
            System.out.println("The String is not empty");
        }
    }
}
