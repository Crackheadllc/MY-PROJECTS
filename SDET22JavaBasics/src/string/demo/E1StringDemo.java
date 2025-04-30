package string.demo;

import java.io.PrintStream;

public class E1StringDemo {

    public static void main(String[] args) {
        String str=new String("Hello World");
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("Hello Syntax"));
        int len=str.length();
        System.out.println(len);
        String s="Java is easy";
        System.out.println(s.length());

    }
}
