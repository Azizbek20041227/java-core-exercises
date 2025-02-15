package integers;
import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Tort honali son : ");
        int Tort = scanner.nextInt();

        int Minglikraqam = Tort / 100 / 10;

        System.out.println("Javob : " + Minglikraqam);
    }
}