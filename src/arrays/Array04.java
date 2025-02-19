package arrays;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 1): ");
        int n = scanner.nextInt();

        System.out.print("A ni kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("R ni kiriting: ");
        double r = scanner.nextDouble();

        if (n <= 1) {
            System.out.println("N 1 dan katta bo'lishi kerak: ");
        } else {
            double [] natija = new double[n];

            for (int i = 0; i < n; i++) {
                natija[i] = a * Math.pow(r, i);
            }

            System.out.print("Natija: ");
            for (double num : natija) {
                System.out.print(num + " ");
            }
        }
    }
}
