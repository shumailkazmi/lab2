import java.util.Arrays;
import java.util.Random;

public class TASK3 {
    public static void main(String[] args) {
        char[][] board = new char[10][10];
        for(int i=0;i<10;i++)
        {
            Arrays.fill(board[i], '0');
        }
        int x = 0;
        int y = 0;
        Random random = new Random();

        while (x != 9 || y != 9) {
            int roll = random.nextInt(6) + 1;
            System.out.println("Iteration (Number generated: " + roll + ")");
            board[y][x] = '0';
            if (x + roll < 10) {
                x += roll;
            } else {
                y++;
                x = roll - (10 - x);
                if (x < 0) {
                    x = 0;
                }
            }
            board[y][x] = 'X';
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Reached the end of the array.");
    }
}