package whiles;
import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();
        System.out.print("K ni kiriting: ");
        int k = scanner.nextInt();

        int counter = 0;
        int qoldiq = n;

        while (qoldiq >= k) {
            qoldiq -= k;
            counter++;
        }
        System.out.println("Bolinma: " + counter);
        System.out.println("Qoldiq: " + qoldiq);
    }
}
