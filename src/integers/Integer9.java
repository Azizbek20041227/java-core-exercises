package integers;
import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Uch honali son : ");
        int Uch = scanner.nextInt();

        int Yuzlikraqam = Uch / 100;

        System.out.println("Yuzlikraqam : " + Yuzlikraqam);
    }
}
