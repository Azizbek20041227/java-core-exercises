package begins;
import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double aKvadirati = a * a;
        double bKvadirati = b * b;

        double Yigindisi = aKvadirati + bKvadirati;
        double Ayirmasi = aKvadirati - bKvadirati;
        double Kopaytmasi = aKvadirati * bKvadirati;
        double Bolinmasi = aKvadirati / bKvadirati;

        System.out.println("Yigindisi : " + Yigindisi);
        System.out.println("Ayirmasi : " + Ayirmasi);
        System.out.println("Kopaytmasi : " + Kopaytmasi);
        System.out.println("Bolinmasi : " + Bolinmasi);
    }
}
