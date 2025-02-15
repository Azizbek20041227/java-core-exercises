package booleans;
import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        boolean Tekshir = (A % 2 == 0);

        System.out.println("Natija : " + Tekshir);
    }
}