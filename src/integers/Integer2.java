package integers;
import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter KG : ");
        int KG = scanner.nextInt();

        int T = 1000;
        int Tonna = KG / T;

        System.out.println("Tonna : " + Tonna);
    }
}
