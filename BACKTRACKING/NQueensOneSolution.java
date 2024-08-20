public class NQueensOneSolution {
    public static void PrintBoard(char board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println(); 
    }

    public static boolean NQueenFun(char board[][], int row) {
        // Base case: if all queens are placed
        if (row == board.length) {
            PrintBoard(board);
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(NQueenFun(board, row + 1))
                {
                    return true;
                }
                board[row][j] = '.'; 
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char board[][] = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.'; // Initialize with '.'
            }
        }
        NQueenFun(board, 0); // Start from row 0
    }
}
