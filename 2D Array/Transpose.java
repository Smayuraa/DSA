import java.util.Scanner;

public class Transpose {
    
    // Function to transpose the matrix and print it
    public static void SumFun(int matrix[][], int n, int m) {
        int Transpose[][] = new int[m][n];
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns (m): ");
        int m = sc.nextInt();
        
        int matrix[][] = new int[n][m];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        SumFun(matrix, n, m);
        
        sc.close();
    }
}
