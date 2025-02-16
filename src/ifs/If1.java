package ifs;
import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sonni kiriting: ");
        int n = scanner.nextInt();

        if (n > 0) {
            n += 1;
        }

        System.out.println("Natija: " + n);
    }
}