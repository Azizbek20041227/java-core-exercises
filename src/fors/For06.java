package fors;
import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 kg shirinlik narxini kiriting: ");
        double narxKg = scanner.nextDouble();

        for (double vazn = 1.2; vazn <= 2.0; vazn += 0.2) {
            double narx = narxKg * vazn;
            System.out.printf("%.1f kg shirinlik narxi: %.2f\n", vazn, narx);
        }
    }
}