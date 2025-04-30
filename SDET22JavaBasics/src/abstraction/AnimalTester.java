package abstraction;

public class AnimalTester {
    public static void main(String[] args) {


        Cat c=new Cat("Mano","Black",12);
        c.speak();
        c.printInfo();
        Dog d=new Dog("Jacky","White",15);
        d.printInfo();

        //Animal a=new Animal();
        //a.speak();
    }
}
