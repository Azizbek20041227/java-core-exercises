package ifs;
import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchta sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int counter = 0;
        if (a > 0) counter++;
        if (b > 0) counter++;
        if (c > 0) counter++;

        System.out.println("Musbat sonlar miqdori: " + counter);
    }
}