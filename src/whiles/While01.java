package whiles;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting (A > B): ");
        int a = scanner.nextInt();
        System.out.print("B ni kiriting (A > B): ");
        int b = scanner.nextInt();

        int qoldiq = a;
        while (qoldiq >= b) {
            qoldiq -= b;
        }
        System.out.println("Ishlatilmagan qoldiq uzunligi: " + qoldiq);
    }
}