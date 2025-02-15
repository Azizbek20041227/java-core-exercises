package integers;
import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Byte : ");
        int Byte = scanner.nextInt();

        int K = 1024;
        int Kegabyte = Byte / K;

        System.out.println("Kegabyte : " + Kegabyte);
    }
}
