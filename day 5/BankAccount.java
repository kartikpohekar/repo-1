import java.util.*;

public class BankAccount {
    private String Name;
    private String AccNo;
    private double Bal;

    public void setAccHolderName(String Name) {
        this.Name = Name;
    }

    public String getAccHolderName() {
        return Name;
    }

    public void setAccNumber(String AccNo) {
        this.AccNo = AccNo;
    }

    public String getAccNumber() {
        return AccNo;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Bal += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= Bal) {
            Bal -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid Withdrawal Amount Entered");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + Name);
        System.out.println("Account Number: " + AccNo);
        System.out.println("Balance: " + Bal);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccHolderName("Kartik Pohekar");
        account1.setAccNumber("32373132");
        account1.deposit(3332);
        account1.withdraw(343);
        account1.displayAccountDetails();
    }
}
