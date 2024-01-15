package HomeWork.chapter12.bankapp.model;
/**
 * Κλάση που αναπαριστά έναν λογαριασμό με δυνατότητα ανάληψης ποσών
 * μεγαλύτερων από το υπόλοιπο του λογαριασμού.
 */
public class OverdraftAccount extends Account {
    private double overdraftLimit;

    public OverdraftAccount() {
        super();
        this.overdraftLimit = 1500.0; // Προεπιλεγμένο όριο ανοχής υπερανάληψης
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}