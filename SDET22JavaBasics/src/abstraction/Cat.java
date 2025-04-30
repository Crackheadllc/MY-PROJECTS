package abstraction;

public class Cat extends Animal {

    Cat(String name,String color,int age){super(name,color,age);};


    void speak(){

        System.out.println("Meow meow.....");
    }

    @Override
    void eat(){
        System.out.println("Cats like to eat fish");
    }
}
