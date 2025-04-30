package conditionalstatements;

import java.util.Scanner;

public class scannerintro {
    public static void main(String[] args) {


        //create scanner
       Scanner input=new Scanner(System.in);

       //prompt user to enter full name
        System.out.println("Please enter your full name");

        //read user input
        String fullName=input.nextLine();

        //print capture value
        System.out.println("Your name is "+fullName);

        System.out.println("Please enter your age");
       int age=input.nextInt();

        System.out.println("Your age is "+age);

        System.out.println("Which school you are currently studying");
        String school=input.next();

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        System.out.println("You are studying at "+school +" and your grade is "+grade);

        System.out.println("Are you enjoying Classes at "+school+". please enter true/false");
        boolean enjoying=input.nextBoolean();

        System.out.println("I am enjoying classes at "+school+" : "+enjoying);

        input.close();
    }
}
