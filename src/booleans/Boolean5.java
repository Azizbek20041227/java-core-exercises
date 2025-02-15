package booleans;
import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        System.out.print("B sonini kiriting: ");
        int B = scanner.nextInt();

        boolean Tekshir = (A >= 0 && B < -2);

        if (Tekshir) {
            System.out.println("Jumla rost");
        } else {
            System.out.println("Jumla yolg'on");
        }
    }
}