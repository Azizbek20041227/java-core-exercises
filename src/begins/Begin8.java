package begins;
import java.util.Scanner;

public class Begin8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double Javob = (a + b) / 2;

        System.out.println("Javob : " + Javob);
    }
}
