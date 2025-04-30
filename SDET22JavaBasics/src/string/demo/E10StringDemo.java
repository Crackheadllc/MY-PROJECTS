package string.demo;

public class E10StringDemo {
    public static void main(String[] args) {

        String str="FHFDhdAsdsjd!@@#@#45657";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Z]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[\\s]",""));
        System.out.println(str.replaceAll(" ",""));
    }
}
