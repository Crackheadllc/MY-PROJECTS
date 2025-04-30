package methodoverriding;

public class PolyTester {
    public static void main(String[] args) {

        /*Dog d=new Dog();
        d.speak();
        d.eat();
        Cat c=new Cat();
        c.eat();
        c.speak();
        Horse h=new Horse();
        h.eat();
        h.speak();
        double age=20;
        int dAge=(int)age;

        Animal a=new Dog();
        Animal cA=new Horse();
        Animal hA=new Cat();
        Cat cat=(Cat)hA;*/

        Animal [] arr={new Dog(),new Cat(),new Horse()};
        //Animal [] arr={c,d,h};
        for (int i = 0; i < arr.length ; i++) {
            Animal an=arr[i];
            an.eat();
            an.speak();
        }
    }
}
