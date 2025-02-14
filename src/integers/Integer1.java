package integers;
import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter SM : ");
        int SM = scanner.nextInt();

        int M = 1000;
        int Metr = SM / M;

        System.out.println("Metr : " + Metr);
    }
}
