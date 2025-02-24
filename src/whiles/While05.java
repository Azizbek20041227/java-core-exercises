package whiles;
import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (2 ning darajasi bolishi kerak): ");
        int n = scanner.nextInt();

        int k = 0;
        while (n > 1) {
            n /= 2;
            k++;
        }
        System.out.println("K ning qiymati: " + k);
    }
}