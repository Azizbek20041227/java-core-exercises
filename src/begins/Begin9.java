package begins;
import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double Kopaytma = a * b;

        System.out.println("Kvadirat ildizi : " + (Math.sqrt(Kopaytma)));
    }
}
