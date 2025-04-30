package access.modifiers;

public class Person {

    public   String name;
    String color;

    public int age;


    void printName(){
        System.out.println(name);
    }

    void printColor(){
        System.out.println(color);
    }

    void  printAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Don";
        p.color="Black";
        p.age=33;
        p.printName();
        p.printColor();
        p.printAge();

    }
}
