package arrays;

public class ArrayIntro {
    public static void main(String[] args) {


        int [] grades =new int[3];
        grades[0]=89;
        grades[1]=86;
        grades[2]=91;

        System.out.println(grades[1]); //86
        System.out.println(grades[0]); //89

        grades[0]=99;
        System.out.println(grades[0]); //99
    }
}
