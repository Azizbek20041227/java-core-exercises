package strings;
import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting (1<N<26): ");
        int N = scanner.nextInt();

        if (N >= 1 && N <= 26) {
            System.out.print("Birinchi " + N + " ta katta harf: ");
            for (int i = 0; i < N; i++) {
                char belgi = (char) ('A' + i);
                System.out.print(belgi + "  ");
            }
            System.out.println();
        } else {
            System.out.println("Son 1 va 26 orasida bo‘lishi kerak.");
        }
    }
}