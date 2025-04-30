package thisworld;

public class Dog {
   private String name;

   private String color;

   String breed;

   private int age;


  private double weight;

  public Dog(){

  }

  public Dog(String name){
      this.name=name;

  }

  public Dog(String name,String color){
      this.name=name;
      this.color=color;

  }

  public Dog(String name,String color,String breed){
      this(name,color);
      /*this.name=name;
      this.color=color;*/
      this.breed=breed;

  }




  public Dog(String name,String Color,String breed,int age,double weight){
       this.name=name;
       this.color=color;
       this.breed=breed;
      this.age=age;
      this.weight=weight;

   }

   void printName(){
       System.out.println(name);
   }

   void printInfo(){

       System.out.println(name+" "+color+" "+age);
   }
}
