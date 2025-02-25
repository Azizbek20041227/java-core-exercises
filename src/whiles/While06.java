package whiles;
import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int N = scanner.nextInt();

        double factorial = 1.0;
        int i = N;

        while (i > 0) {
            factorial *= i;
            i -= 2;
        }

        System.out.println(N + "--> " + factorial);
    }
}