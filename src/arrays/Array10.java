package arrays;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv uzunligini kiriting: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Juft sonlar (indeks bo'yicha o'sish tartibida): ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "  ");
            }
        }

        System.out.print("\nToq sonlar (indeks bo'yicha kamayish tartibida): ");
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}