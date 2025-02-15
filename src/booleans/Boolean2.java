package booleans;
import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        boolean Tekshir = (A % 2 != 0);

        if (Tekshir) {
            System.out.println("Jumla rost: A soni toq");
        } else {
            System.out.println("Jumla yolg'on: A soni juft");
        }
    }
}