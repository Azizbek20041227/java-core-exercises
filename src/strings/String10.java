package strings;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();

        String teskarisi = new StringBuilder(str).reverse().toString();
        System.out.println("Teskari satr: " + teskarisi);
    }
}