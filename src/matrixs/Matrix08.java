package matrixs;
import java.util.Scanner;

public class Matrix08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M ni kiriting: ");
        int m = scanner.nextInt();
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[m][n];

        System.out.println("Matritsa elemetlarini kiriting: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Chiqarish uchun qator raqamini kiriting: ");
        int k = scanner.nextInt();

        if (k >= 1 && k <= n) {
            System.out.println(k + " - ustun elemetlari: ");
            for (int i = 0; i < m; i++) {
                System.out.println(matrix[i][k - 1] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Xatolik! K notogri joyda: ");
        }
    }
}