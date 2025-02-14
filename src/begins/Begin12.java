package begins;
import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double Kvatiratildizi = (a * a) + (b * b);
        double cTomoni = (Math.sqrt(Kvatiratildizi));
        double Perimetiri = a + b + cTomoni;

        System.out.println("cTomoni : " + cTomoni);
        System.out.println("Perimetiri : " + Perimetiri);
    }
}
