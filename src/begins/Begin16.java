package begins;
import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X1: ");
        double X1 = scanner.nextDouble();
        System.out.print("Enter X2: ");
        double X2 = scanner.nextDouble();

        double Masofasi = X2 - X1;

        System.out.println("Masofasi : " + Masofasi);
    }
}
