package integers;
import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ikki honali son : ");
        int Ikki = scanner.nextInt();

        int Birinchiraqam = Ikki / 10;
        int Ikkinchiraqam = Ikki % 10;

        System.out.println("Butun son : " + Ikkinchiraqam + Birinchiraqam);
    }
}
