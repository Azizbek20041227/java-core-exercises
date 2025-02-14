package begins;
import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X1 : ");
        double X1 = scanner.nextDouble();
        System.out.print("Enter Y1 : ");
        double Y1 = scanner.nextDouble();
        System.out.print("Enter X2 : ");
        double X2 = scanner.nextDouble();
        System.out.print("Enter Y2 : ");
        double Y2 = scanner.nextDouble();

        double Perimetiri = X1 + X2 + Y1 + Y2;
        double Maydoni = X1 * Y2;

        System.out.println("Perimetiri : " + Perimetiri);
        System.out.println("Maydoni : " + Maydoni);
    }
}
