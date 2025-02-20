package fors;
import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int a = scanner.nextInt();

        System.out.print("B ni kiriting (A < B): ");
        int b = scanner.nextInt();

        int counter = 0;

        if (a < b) {
            for (int i = b; i >= a; i--) {
                System.out.println(i);
                counter++;
            }
            System.out.print("Jami sonlar soni: " + counter);
        } else {
            System.out.print("A B dan kichik bolishi kerak: ");
        }
    }
}