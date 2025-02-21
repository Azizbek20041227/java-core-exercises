package matrixs;
import java.util.Scanner;

public class Matrix03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M ni kiritng: ");
        int m = scanner.nextInt();
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int[] uzunligi = new int[m];
        System.out.println("M uzunlikdagi haqiqiy sonlarni kiriting: ");
        for (int i = 0; i < m; i++) {
            uzunligi[i] = scanner.nextInt();
        }
        int[][] matrix = new int[m][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                matrix[i][j] = uzunligi[i];
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