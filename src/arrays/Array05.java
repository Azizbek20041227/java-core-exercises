package arrays;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 2): ");
        int n = scanner.nextInt();

        if (n <= 2) {
            System.out.println("N 2 dan katta bo'lishi kerak: ");
        } else {
            int[] fibonacci = new int[n];

            fibonacci[0] = 1;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }

            System.out.print("Natija: ");
            for (int num : fibonacci) {
                System.out.print(num + " , ");
            }
        }
    }
}