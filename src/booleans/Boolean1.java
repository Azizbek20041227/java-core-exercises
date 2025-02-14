package booleans;
import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scanner.nextInt();
        boolean Answer = A > 0;

        if (Answer) {
            System.out.println("Jumla rost: A soni musbat.");
        } else {
            System.out.println("Jumla yolg'on: A soni musbat emas");
        }
    }
}
