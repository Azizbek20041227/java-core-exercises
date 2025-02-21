package matrixs;
import java.util.Scanner;

public class Matrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M ni kiriting: ");
        int m = scanner.nextInt();
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();
        System.out.print("D ni kiriting: ");
        double d = scanner.nextDouble();

        double[] uzunlik = new double[m];
        System.out.println("M uzunlikdagi haqiqiy sonlarni kiriting:");
        for (int i = 0; i < m; i++) {
            uzunlik[i] = scanner.nextDouble();
        }
        double[][] matrix = new double[m][n];
        for (int i = 0; i < m; i++) {
            matrix[i][0] = uzunlik[i];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                matrix[i][j] = matrix[i][j - 1] + d;
            }
        }

        System.out.println("Hosil bo'lgan matritsa: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}