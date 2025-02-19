package arrays;
import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv uzunligini kiriting: ");
        int n = scanner.nextInt();

        int[] sonlar = new int[n];
        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            sonlar[i] = scanner.nextInt();
        }

        int counter = 0;
        System.out.print("Toq sonlar: ");
        for (int num : sonlar) {
            if (num % 2 != 0) {
                System.out.print(num + "  ");
                counter++;
            }
        }

        System.out.println("\tToq sonlar soni: " + counter);
    }
}