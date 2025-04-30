package thisworld;

public class DogTester {
    public static void main(String[] args) {


        Dog d=new Dog("jacky","black","German",12,45.5);
        d.printInfo();

        Dog d2=new Dog("Jacky");
        d2.printName();
    }
}
