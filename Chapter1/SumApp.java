package HomeWork.Chapter1;
/**
 * 1) Δηλώνει δύο μεταβλητές ακεραίων num1 και num2
 * και τις αρχικοποιεί στις τιμές 19 και 30 αντίστοιχα.
 * 2)Υπολογίζει το άθροισμα num1 + num2 και το
 * αποθηκεύει στη μεταβλητή sum.
 * 3): εκτυπώνει: Το αποτέλεσμα της πρόσθεσης είναι  το 49.
 */
public class SumApp {

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 30;
        int sum = 0;

        sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με " + sum);
    }
}