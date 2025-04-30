package interfacedemo;

public interface Human {

    void walk();
}

interface  Person extends Human{

    void eat();
}

interface Employee extends Person,Human{
    void work();
}

class Josh implements Employee{

    @Override
    public void walk() {
        System.out.println("Josh is walking");
    }

    @Override
    public void eat() {
        System.out.println("Josh is eating");
    }

    @Override
    public void work() {
        System.out.println("Working..........");
    }
}
