package ifs;
import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int kattasi;
        int kichkinasi;

        if (a > b) {
            kattasi = a;
            kichkinasi = b;
        } else {
            kattasi = b;
            kichkinasi = a;
        }

        System.out.println("Katta son: " + kattasi);
        System.out.println("Kichik son: " + kichkinasi);
    }
}