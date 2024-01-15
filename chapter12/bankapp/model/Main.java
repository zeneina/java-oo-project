package HomeWork.chapter12.bankapp.model;

import gr.aueb.cf.ch15.Account.model.JointAccount;
import gr.aueb.cf.ch15.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.exceptions.SsnNotValidException;

public class Main {

    public static void main(String[] args) throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException {
        // Έλεγχος λειτουργίας
        Account account = new Account();
        account.deposit(1000.0);
        account.withdraw(500.0);
        System.out.println("Balance: " + account.getBalance());

        OverdraftAccount overdraftAccount = new OverdraftAccount();
        overdraftAccount.deposit(1500.0);
        overdraftAccount.withdraw(2000.0);
        System.out.println("Overdraft Account Balance: " + overdraftAccount.getBalance());

        // Δημιουργία κοινού λογαριασμού με δύο κατόχους
        JointAccount jointAccount = new JointAccount("Holder1", "Holder2");

        // Κατάθεση χρημάτων στον κοινό λογαριασμό
        jointAccount.deposit(2000.0);
        System.out.println("Joint Account Balance: " + jointAccount.getBalance());

        // Ανάληψη χρημάτων από τον κοινό λογαριασμό
        jointAccount.withdraw(500.0);
        System.out.println("Joint Account Balance after withdrawal: " + jointAccount.getBalance());
    }
}


