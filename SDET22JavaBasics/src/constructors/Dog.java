package constructors;

public class Dog {

   public String name;

   public String color;

    public int age;

    public Dog(String dName,String dColor,int dAge) {
        name = dName;
        color = dColor;
        if (dAge > 50) {
            System.out.println("Please Enter proper age");
        } else {
            age = dAge;
        }
    }

    public void speak(){
        System.out.println("wuff wuff");
    }
}
