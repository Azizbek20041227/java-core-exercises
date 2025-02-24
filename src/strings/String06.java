package strings;
import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birorta belgi kiriting: ");
        char C = scanner.next().charAt(0);

        if (Character.isDigit(C)) {
            System.out.println("Raqam");
        } else if (Character.isUpperCase(C)) {
            System.out.println("Katta harf");
        } else {
            System.out.println("Kichik harf");
        }
    }
}