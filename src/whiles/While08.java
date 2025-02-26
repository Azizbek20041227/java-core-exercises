package whiles;
import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int N = scanner.nextInt();

        int K = 1;
        while ((K + 1) * (K + 1) <= N) {
            K++;
        }

        System.out.println("Eng katta K: " + K);
    }
}