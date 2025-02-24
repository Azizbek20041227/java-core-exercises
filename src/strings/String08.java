package strings;
import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 0): ");
        int N = scanner.nextInt();

        System.out.print("C belgisini kiriting: ");
        char C = scanner.next().charAt(0);

        if (N > 0) {
            String natija = String.valueOf(C).repeat(N);
            System.out.println("Natija: " + natija);
        } else {
            System.out.println("N > 0 bo‘lishi kerak: ");
        }
    }
}