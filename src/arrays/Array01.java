package arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son ni kiriting: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Musbat son kirting: ");
        } else {
            int [] toqsonlar = new int[n];

            for (int i = 0; i < n; i++) {
                toqsonlar[i] = 2 * i + 1;
            }

            System.out.print("Natija: ");
            for (int num : toqsonlar) {
                System.out.print(num + " ");
            }
        }
    }
}