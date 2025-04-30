package abstraction;

public class Dog extends Animal{

    Dog(String name,String color,int age){super(name,color,age);}

    void speak() {
        System.out.println("wuff wuff...");
    }


    @Override
    void eat() {
        System.out.println("Wuff Wuff");
    }
}
