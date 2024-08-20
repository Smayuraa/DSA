public class SudokuSolver {
    // Step-1: Check if placing a digit is safe
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check row
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check column
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[j][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Step-2: Solve Sudoku using backtracking
    public static boolean SudokuSolverFun(int[][] sudoku, int row, int col) {
        
        if (row == 9) {
            return true;
        }

        // Calculate the next row and column
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

       
        if (sudoku[row][col] != 0) {
            return SudokuSolverFun(sudoku, nextRow, nextCol);
        }

        // placing digits 1-9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (SudokuSolverFun(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0; // Backtrack
            }
        }

        return false; 
    }

    // Step-3: Print the solved Sudoku
    public static void PrintSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method 
    public static void main(String[] args) {
        int[][] sudoku = { 
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
        };
        
        if (SudokuSolverFun(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            PrintSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist.");
        }
    }
}
