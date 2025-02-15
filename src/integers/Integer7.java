package integers;
import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ikki honali son : ");
        int Ikki = scanner.nextInt();

        int Birinchiraqam = Ikki / 10;
        int Ikkinchiraqam = Ikki % 10;
        int Yigindi = Birinchiraqam + Ikkinchiraqam;
        int Kopaytma = Birinchiraqam * Ikkinchiraqam;

        System.out.println("Yigindisi : " + Yigindi);
        System.out.println("Kopaytmasi : " + Kopaytma);
    }
}
