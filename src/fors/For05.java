package fors;
import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 kg shirinlik narxini kiriting: ");
        double kilogram = scanner.nextDouble();

        for (double kg = 0.1; kg <= 1.0; kg += 0.1) {
            double narx = kilogram * kg;
           System.out.printf("%.1f kg shirinlik narxi: %.2f\n", kg, narx);
        }
    }
}