package strings;
import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (juft son): ");
        int N = scanner.nextInt();
        System.out.print("C1 ni kiriting: ");
        char C1 = scanner.next().charAt(0);
        System.out.print("C2 ni kiriting: ");
        char C2 = scanner.next().charAt(0);

        StringBuilder natija = new StringBuilder();
        for (int i = 0; i < N; i++) {
            natija.append(i % 2 == 0 ? C1 : C2);
        }

        System.out.println("Natija: " + natija);
    }
}