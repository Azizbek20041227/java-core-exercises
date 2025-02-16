package ifs;
import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int kattasi;

        if (a > b) {
            kattasi = a;
        } else {
            kattasi = b;
        }

        System.out.println("Katta raqam: " + kattasi);
    }
}