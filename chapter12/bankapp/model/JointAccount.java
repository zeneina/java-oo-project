package HomeWork.chapter12.bankapp.model;

/**
 * Κλάση που αναπαριστά έναν κοινό λογαριασμό με δύο κατόχους.
 */
public class JointAccount extends Account {

    private String holder1;
    private String holder2;

    public JointAccount(String holder1, String holder2) {
        super();
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    /**
     * Υλοποίηση της μεθόδου deposit για τον κοινό λογαριασμό.
     * @param amount Το ποσό που θα κατατεθεί.
     */
    @Override
    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("Invalid deposit amount or null balance");
        }
    }
}
