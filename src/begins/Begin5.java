package begins;
import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        double Hajmi = a * a * a;
        double Sirti = 6 * a * a;

        System.out.println("Hajmi : " + Hajmi);
        System.out.println("Sirti : " + Sirti);
    }
}
