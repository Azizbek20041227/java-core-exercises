package begins;
import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter D: ");
        double D = scanner.nextDouble();

        double Uzunligi = 3.14 * D;
        double Sirti = 3.14 * (D * D) / 4;

        System.out.println("Uzunligi : " + Uzunligi);
        System.out.println("Sirti : " + Sirti);
    }
}
