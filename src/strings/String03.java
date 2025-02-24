package strings;
import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birorta belgi kiriting: ");
        char belgi = scanner.next().charAt(0);

        char oldingibelgi = (char) (belgi - 1);
        char keyingibelgi = (char) (belgi + 1);

        System.out.println("Oldingi belgi: " + oldingibelgi);
        System.out.println("Keyingi belgi: " + keyingibelgi);
    }
}