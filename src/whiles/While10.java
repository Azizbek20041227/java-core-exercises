package whiles;
import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int N = scanner.nextInt();
        scanner.close();

        int K = 0;
        int power = 1;

        while (power * 3 < N) {
            K++;
            power *= 3;
        }

        System.out.println("Eng katta K: " + K);
    }
}