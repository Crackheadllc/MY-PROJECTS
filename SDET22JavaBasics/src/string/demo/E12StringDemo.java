package string.demo;

public class E12StringDemo {
    public static void main(String[] args) {

        String str = "Java is easy. Java is fun";
        String[] strArr = str.split("[i]");
        System.out.println(strArr.length);
        for (String s : strArr) {
            System.out.println(s.trim());
        }
    }
}
