public class BoardGame {
    private int size = 10; // size of the board
    private char empty = ' ';
    private char trap = '#';
    private char current = 'C';
    private char boat = 'B';
    private char[][] board;

    public BoardGame() {
        // Initialize the game board
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = empty;
            }
        }

        // Add some traps and currents for demonstration
        board[2][2] = trap;
        board[3][4] = current;
        board[1][1] = boat; // Initial position of the boat
    }

    public void printBoard() {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == empty) {
                    System.out.printf("[%2d]", count);
                } else {
                    System.out.printf("[%2s]", board[i][j]);
                }
                count++;
            }
            System.out.println();
            
     
        }
    }
}                           


