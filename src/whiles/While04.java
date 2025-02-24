package whiles;
import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();

        boolean natija = true;

        if (n <= 0) {
            natija = false;
        } else {
            while (n % 3 == 0) {
                n /= 3;
            }
            if (n != 1) {
                natija = false;
            }
        }
        System.out.println(natija);
    }
}