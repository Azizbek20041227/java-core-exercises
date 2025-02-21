package matrixs;
import java.util.Scanner;

public class Matrix02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M ni kiriting: ");
        int m = scanner.nextInt();

        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 5 * (j + 1);
            }
        }
        System.out.println("Hosil bolgan matritsa: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}