package integers;
import java.util.Scanner;

public class Integer13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Uch honali son : ");
        int Uch = scanner.nextInt();

        int Yuzlikraqam = Uch / 100 + 1;
        int Onlikraqam = Uch / 10 % 10;
        int Birlikraqam = Uch % 100 % 10;

        System.out.println("Javob : " + Yuzlikraqam + Onlikraqam + Birlikraqam);
    }
}
