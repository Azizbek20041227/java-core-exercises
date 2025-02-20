package fors;
import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int a = scanner.nextInt();

        System.out.print("B ni kiriting(A < B): ");
        int b = scanner.nextInt();

        int kopaytma = 1;

        if (a<b) {
            for (int i = a; i <= b; i++) {
                kopaytma *= i;
            }
            System.out.println("A dan B gacha bolgan sonlar kopaytmasi: " + kopaytma);
        } else {
            System.out.println("A B dan kichik bolishi kerak: ");
        }
    }
}