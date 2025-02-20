package fors;
import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("K ni kiriting: ");
        int k = scanner.nextInt();

        System.out.print("N ni kiriting (N > 0): ");
        int n = scanner.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(k);
            }
        } else {
            System.out.println("N musbat bolishi kerak: ");
        }
    }
}