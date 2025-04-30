package exceptions;

public class BankTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(100);
        bankAccount.transferFunds(120);
    }
}
