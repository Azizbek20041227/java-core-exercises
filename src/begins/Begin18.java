package begins;
import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A : ");
        double A = scanner.nextDouble();
        System.out.print("Enter B : ");
        double B = scanner.nextDouble();
        System.out.print("Enter C : ");
        double C = scanner.nextDouble();

        double AC = A + C;
        double BC = B + C;
        double Kopaytmasi = AC * BC;

        System.out.println("Kopaytmasi : " + Kopaytmasi);
    }
}
