package booleans;
import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A : ");
        int A = scanner.nextInt();

        boolean Tekshir = A > 0;

        System.out.println("Natija : " + Tekshir);
    }
}
