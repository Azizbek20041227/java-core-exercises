package begins;
import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter R1: ");
        double R1 = scanner.nextDouble();
        System.out.print("Enter R2: ");
        double R2 = scanner.nextDouble();

        double S1 = 3.14 * (R1 * R1);
        double S2 = 3.14 * (R2 * R2);
        double S3 = S1 - S2;

        System.out.println("S1 : " + S1);
        System.out.println("S2 : " + S2);
        System.out.println("S3 : " + S3);
    }
}
