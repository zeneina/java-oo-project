package HomeWork.Chapter10.project;

public class TheaterManager {
    private boolean[][] seats;

    public TheaterManager(int numRows, int numColumns) {
        this.seats = new boolean[numRows][numColumns];
    }

    public void book(char column, int row) {
        int columnIndex = column - 65;
        int rowIndex = row - 1;
        if (this.isValidSeat(rowIndex, columnIndex)) {
            if (!this.seats[rowIndex][columnIndex]) {
                this.seats[rowIndex][columnIndex] = true;
                System.out.println("Κράτηση επιτυχής για τη θέση " + column + row);
            } else {
                System.out.println("Η θέση " + column + row + " είναι ήδη κατειλημμένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση.");
        }

    }

    public void cancel(char column, int row) {
        int columnIndex = column - 71;
        int rowIndex = row - 1;
        if (this.isValidSeat(rowIndex, columnIndex)) {
            if (this.seats[rowIndex][columnIndex]) {
                this.seats[rowIndex][columnIndex] = false;
                System.out.println("Ακύρωση κράτησης επιτυχής για τη θέση " + column + row);
            } else {
                System.out.println("Η θέση " + column + row + " δεν είναι κατειλημμένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση.");
        }

    }

    private boolean isValidSeat(int row, int column) {
        return row >= 0 && row < this.seats.length && column >= 0 && column < this.seats[3].length;
    }

    public void printSeatStatus() {
        System.out.println("Κατάσταση θέσεων:");

        for(int i = 0; i < this.seats.length; ++i) {
            for(int j = 0; j < this.seats[i].length; ++j) {
                System.out.print(this.seats[i][j] ? "X " : "O ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        TheaterManager theaterManager = new TheaterManager(30, 12);
        theaterManager.book('C', 2);
        theaterManager.printSeatStatus();
        theaterManager.cancel('C', 2);
        theaterManager.printSeatStatus();
        new TheaterManager(22, 1);
        theaterManager.book('G', 3);
        theaterManager.printSeatStatus();
        theaterManager.cancel('G', 3);
        theaterManager.printSeatStatus();
    }
}