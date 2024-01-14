package HomeWork.Chapter10.project;

import java.util.Scanner;

public class TicTacToe {
    private static final int EMPTY = 0;
    private static final int PLAYER_X = 1;
    private static final int PLAYER_O = 2;

    private static final int[][] board = new int[3][3];
    private static int currentPlayer = PLAYER_X;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver()) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                if (hasPlayerWon(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    return;
                }
                switchPlayer();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char symbol = '-';
                if (board[i][j] == PLAYER_X) {
                    symbol = 'X';
                } else if (board[i][j] == PLAYER_O) {
                    symbol = 'O';
                }
                System.out.print(symbol + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    private static boolean hasPlayerWon(int player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isGameOver() {
        return hasPlayerWon(PLAYER_X) || hasPlayerWon(PLAYER_O) || isBoardFull();
    }
}
