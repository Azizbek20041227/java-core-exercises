package begins;
import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double Yigindisi = a + b;
        double Ayirmasi = a - b;
        double Kopaytmasi = a * b;
        double Bolinmasi = a / b;

        System.out.println("Yigindisi : " + Yigindisi);
        System.out.println("Ayirmasi : " + Ayirmasi);
        System.out.println("Kopaytmasi : " + Kopaytmasi);
        System.out.println("Bolinmasi : " + Bolinmasi);
    }
}
