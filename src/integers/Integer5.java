package integers;
import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A : ");
        int A = scanner.nextInt();
        System.out.print("Enter B : ");
        int B = scanner.nextInt();

        int Javob = A % B;

        System.out.println("Javob : " + Javob);
    }
}
