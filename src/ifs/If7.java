package ifs;
import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int kichkinasi;

        if (a < b) {
            kichkinasi = 1;
        } else {
            kichkinasi = 2;
        }

        System.out.println("Kichik sonning tartib raqami: " + kichkinasi);
    }
}