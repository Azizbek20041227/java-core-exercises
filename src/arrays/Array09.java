package arrays;
import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int[] ketmaketlik = new int[n];

        System.out.println(n + " ta son kiriting: ");
        for (int i = 0; i < n; i++) {
            ketmaketlik[i] = scanner.nextInt();
        }

        int counter = 0;
        System.out.print("Toq sonlarning indekslari: ");
        for (int i = 0; i < n; i++) {
            if (ketmaketlik[i] % 2 != 0) {
                System.out.print((i + 1) + "  ");
                counter++;
            }
        }
        System.out.print("\tToq sonlar soni: " + counter);

    }
}