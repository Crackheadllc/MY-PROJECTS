package string.demo;

public class E6StringDemo {
    public static void main(String[] args) {

        String str="Hello Java";
        System.out.println(str.charAt(0));
        char c=str.charAt(1);
        System.out.println(c);

        for (int i = 0; i < str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

        int count=0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='a'){
                count++;

            }

        }
        System.out.println(count);
    }

}
