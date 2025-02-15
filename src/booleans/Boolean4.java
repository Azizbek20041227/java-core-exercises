package booleans;
import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        boolean Tekshir = (A > 2 && B <= 3);

        if (Tekshir) {
            System.out.println("Jumla rost");
        } else {
            System.out.println("Jumla yolg'on");
        }
    }
}
