package begins;
import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double Hajmi = a * b * c;
        double Sirti = 2 * (a * b + b * c + a * c);

        System.out.println("Hajmi : " + Hajmi);
        System.out.println("Sirti : " + Sirti);
    }
}
