package begins;
import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double Sirti = a * b;
        double Perimeteri = 2 * (a+b);

        System.out.println("Sirti: " + Sirti);
        System.out.println("Perimeteri: " + Perimeteri);
    }
}
