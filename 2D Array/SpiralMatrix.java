import java.util.Scanner;

public class SpiralMatrix {
    public static void MyArray(int matrix[][]) {
        int startRow = 0,
            startCol = 0,
            endRow = matrix.length - 1,
            endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }
            // left column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        MyArray(matrix);
    }
}
