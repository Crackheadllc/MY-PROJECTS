package finalkeyword;

public class Animal {

    final String name="Jacky";

    final static int noOfLegs=4;

    void speak(){
        System.out.println("Animals can speak");
    }


    public static void main(String[] args) {

         int age=32;

        age=34;
        System.out.println(age);
        Animal a=new Animal();
        // a.name="Jimi";
        // Animal.noOfLegs=45;

    }
}

class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("Wuff Wuff");
    }

}
