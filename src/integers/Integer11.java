package integers;
import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Uch honali son : ");
        int Uch = scanner.nextInt();

        int Yuzlikraqam = Uch / 100;
        int Onlikraqam = Uch / 10 % 10;
        int Birlikraqam = Uch % 100 % 10;

        int Yigindi = Yuzlikraqam + Onlikraqam + Birlikraqam;
        int Kopaytma = Yuzlikraqam * Onlikraqam * Birlikraqam;

        System.out.println("Yigindisi : " + Yigindi);
        System.out.println("Kopaytmasi : " + Kopaytma);
    }
}
