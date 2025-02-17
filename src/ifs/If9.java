package ifs;
import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
           int almashtir = a;
           a = b;
           b = almashtir;
        }

        System.out.println("A (kichik qiymat): " + a);
        System.out.println("B (katta qiymat): " + b);
    }
}