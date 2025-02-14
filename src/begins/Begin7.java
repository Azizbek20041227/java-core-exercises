package begins;
import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter R: ");
        double R = scanner.nextDouble();

        double Uzunligi = 2 * 3.14 * R;
        double Sirti = 3.14 * (R * R);

        System.out.println("Uzunligi : " + Uzunligi);
        System.out.println("Sirti : " + Sirti);
    }
}
