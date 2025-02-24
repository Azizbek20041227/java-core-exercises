package strings;
import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting (32<N<126): ");
        int N = scanner.nextInt();

        if (N >= 32 && N <= 126) {
            char belgi = (char) N;
            System.out.println("Unicode belgi: " + belgi);
        } else {
            System.out.println("N notogri raqam: ");
        }
    }
}