package encapsulation;

public class BankAccount {

    private String name;

    private String userName;

    private String password;

    public BankAccount(String name, String userName, String password){
        this.name=name;
        this.userName=userName;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
class BankTester{
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount("Josh","Josh123","Pass123");
        bankAccount.setName("Jim");
        System.out.println(bankAccount.getName());
    }
}