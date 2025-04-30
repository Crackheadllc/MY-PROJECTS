package abstraction;

public abstract class Animal {

    String name;

    String color;

    int age;

    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;

    }
    abstract void speak();

    abstract void eat();

    void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}