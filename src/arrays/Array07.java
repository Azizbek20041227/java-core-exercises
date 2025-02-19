package arrays;
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Massiv elementlarini kiriting: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Teskari tartibda chiqarish: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " , ");
        }
    }
}