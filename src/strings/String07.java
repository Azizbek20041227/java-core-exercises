package strings;
import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();

        if (!str.isEmpty()) {
            char birinchibelgi = str.charAt(0);
            char oxirgibelgi = str.charAt(str.length() - 1);

            System.out.println("Birinchi belgi: " + birinchibelgi + " -> " + (int) birinchibelgi);
            System.out.println("Oxirgi belgi: " + oxirgibelgi + " -> " + (int) oxirgibelgi);
        } else {
            System.out.println("Satr bo‘sh bo‘lmasligi kerak: ");
        }
    }
}