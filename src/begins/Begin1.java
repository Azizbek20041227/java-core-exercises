package begins;
import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        double Perimeteri = 4 * a;

        System.out.println("Perimeteri: " + Perimeteri);

    }
}
