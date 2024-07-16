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
/*

Encapsulation is one of the fundamental principles of object-oriented programming (OOP).
It involves wrapping the data (attributes) and methods (functions) into a single unit called a class.
Encapsulation helps to protect the data from unauthorized access and modification.

In the BankAccount class, encapsulation is implemented by:

Private Attributes: The attributes accountNumber, accountHolderName, and balance are declared as private.
This means they cannot be directly accessed or modified from outside the class.

Public Methods: Public methods such as deposit, withdraw, and displayAccountDetails provide controlled access to the private attributes.
These methods include logic to ensure that the operations are valid (e.g., ensuring the deposit amount is positive and the withdrawal amount does not exceed the balance).
 */