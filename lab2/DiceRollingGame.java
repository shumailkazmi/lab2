import java.util.Random;

public class DiceRollingGame {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        int xRow = 0; // Initial row position of 'x'
        int xCol = 0; // Initial column position of 'x'
        board[xRow][xCol] = 1; // Use '1' to represent 'x'

        Random random = new Random();
        int iterations = 0;

        while (xRow < 9 || xCol < 9) {
            int diceRoll = random.nextInt(6) + 1;
            System.out.println("Iteration " + (iterations + 1) + " (Number generated: " + diceRoll + ")");
            
            // Clear the current position of 'x'
            board[xRow][xCol] = 0;

            // Update 'x' position based on the dice roll
            if (diceRoll == 1 && xCol < 9) {
                xCol++;
            } else if (diceRoll == 2 && xRow < 9) {
                xRow++;
            } else if (diceRoll == 3 && xCol > 0) {
                xCol--;
            } else if (diceRoll == 4 && xRow > 0) {
                xRow--;
            } else if (diceRoll == 5 && xRow < 9) {
                xRow++;
            } else if (diceRoll == 6 && xCol < 9) {
                xCol++;
            }

            // Set 'x' at the new position
            board[xRow][xCol] = 1;

            // Print the current state of the board
            printBoard(board);

            iterations++;
        }

        System.out.println("Reached the end in " + iterations + " iterations.");
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
