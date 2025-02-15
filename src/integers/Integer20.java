package integers;
import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Soniya : ");
        int Soniya = scanner.nextInt();

        int Soat = Soniya / 60 / 60;

        System.out.println("Soat : " + Soat);
    }
}