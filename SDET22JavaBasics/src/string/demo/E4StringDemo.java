package string.demo;

public class E4StringDemo {
    public static void main(String[] args) {

        String str="Today is Sunday";
        System.out.println(str.startsWith("Java"));
        boolean cond=str.startsWith("Java");
        System.out.println(cond);
        System.out.println(str.endsWith("Sunday"));
        System.out.println(str.contains("Today"));
        System.out.println(str.contains("Java"));
    }
}
