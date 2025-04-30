package stringbuilder.demo;

public class E5StringBuilder {
    public static void main(String[] args) {
        String s="Python";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        s=sb.toString();
        System.out.println(s);
    }
}
