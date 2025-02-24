package whiles;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting (A > B): ");
        int a = scanner.nextInt();
        System.out.print("B ni kiritng (A > B): ");
        int b = scanner.nextInt();

        int counter = 0;

        while (a >= b) {
            a -= b;
            counter++;
        }
        System.out.println("B segmentlar soni: " + counter);
    }
}