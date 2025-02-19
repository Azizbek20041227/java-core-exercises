package arrays;
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 2): ");
        int n = scanner.nextInt();

        System.out.print("A ni kiriting: ");
        int a = scanner.nextInt();

        System.out.print("B ni kiriting: ");
        int b = scanner.nextInt();

        if (n <= 2) {
            System.out.println("N 2 dan katta bo'lishi kerak: ");
        } else {
            int[] natija = new int[n];

            natija[0] = a;
            natija[1] = b;

            for (int i = 2; i < n; i++) {
                natija[i] = 0;
                for (int j = 0; j < i; j++) {
                    natija[i] += natija[j];
                }
            }

                System.out.print("Natija: ");
                for (int num : natija) {
                    System.out.print(num + " , ");
                }
        }
    }
}