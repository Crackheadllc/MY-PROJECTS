package methodoverriding;

public class Animal {
    void speak (){
        System.out.println("Animals speaks");
    }

    void eat(){
        System.out.println("Animals Eat");
    }
}
class Dog extends Animal {

    void speak(){
        System.out.println("Wuff Wuff");
    }

    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow");
    }

    void eat() {
        System.out.println("Dogs like to eat fish");
    }
}

class Horse extends Animal {
    void speak() {
        System.out.println("Neigh Neigh");
    }

    void eat() {
        System.out.println("Dogs like to eat Grass");

    }
}

