package inheritance;

public class AnimalTester {
    public static void main(String[] args) {


        Cat c=new Cat();
        c.name="lol";
        c.color="Black";
        c.age=20;
        c.speak();
        c.printInfo();
        Dog d=new Dog();
        d.name="jacky";
        d.color="White";
        d.age=15;
        d.printInfo();
    }
}
