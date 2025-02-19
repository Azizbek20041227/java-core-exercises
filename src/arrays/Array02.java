package arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son ni kiriting: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.print("Musbat son kirting: ");
        } else {
            int [] darajasi = new int[n];

            for (int i = 0; i < n; i++) {
                darajasi[i] = (int) Math.pow(2, i + 1);
            }

            System.out.print("Natija: ");
            for (int num : darajasi) {
                System.out.print(num + " ");
            }
        }
    }
}