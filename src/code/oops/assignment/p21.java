package code.oops.assignment;

public class p21 {
    public static void main(String[] args) {
    BankAccount bank = new BankAccount("aditya",9191,2000);
    bank.deposit(200);
    bank.displayAccountDetails();
    bank.withdraw(100);
    bank.displayAccountDetails();
    }
}

class BankAccount {
    private String name ;
    private int AccountNum;
    private double balance ;

    public BankAccount(String name , int AccountNum, double balance) {
        this.name= name ;
        this.AccountNum = AccountNum;
        this.balance = balance ;
    }
    void deposit(double amount) {
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if (amount>0 && amount <= balance) {
            balance -=amount ;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + AccountNum);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
    }

}