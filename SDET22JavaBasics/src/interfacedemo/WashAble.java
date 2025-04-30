package interfacedemo;

public interface WashAble {

    int GRAVITY=9;
    void wash();

}

class Car implements WashAble{

    @Override
    public void wash() {
        System.out.println("Washing the car");
    }
}

class Horse implements WashAble{
    @Override
    public void wash() {
        System.out.println("Washing the Horse");
    }
}
