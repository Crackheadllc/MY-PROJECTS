package stringbuilder.demo;

public class E2StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.insert(1,'c');
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
