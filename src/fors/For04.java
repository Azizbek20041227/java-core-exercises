package fors;
import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 kg kanfet narxini kiriting: ");
        int narx = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "kg kanfet narxi: " + (i * narx));
        }
    }
}