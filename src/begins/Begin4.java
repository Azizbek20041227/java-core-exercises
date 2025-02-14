package begins;
import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        double Uzunligi = 3.14 * d;

        System.out.println("Uzunligi: " + Uzunligi);
    }
}
