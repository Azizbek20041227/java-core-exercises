package fors;
import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sonini kiriting(N > 0): ");
        int n = scanner.nextInt();

        double yigindi = 0.0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                yigindi += 1.0 / i;
            }
            System.out.println("Yigindisi: " + yigindi);
        } else {
            System.out.println("N nol dan katta bolishi kerak: ");
        }
    }
}