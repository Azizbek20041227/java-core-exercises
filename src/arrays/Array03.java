package arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 1): ");
        int n = scanner.nextInt();

        System.out.print("A ni kiriting: ");
        int a = scanner.nextInt();

        System.out.print("D ni kiriting: ");
        int d  = scanner.nextInt();

        if (n <= 1) {
            System.out.println("N 1 dan katta bo'lishi kerak: ");
        } else {
            int [] natija = new int[n];

            for (int i = 0; i < n; i++) {
                natija[i] = a + i * d;
            }

            System.out.print("Natija: ");
            for (int num : natija) {
                System.out.print(num + " ");
            }
        }
    }
}