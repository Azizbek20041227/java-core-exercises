package cases;
import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yonalishni kiriting (N, W, S, E): ");
        char tomon = scanner.next().charAt(0);

        System.out.print("Buyruqni kiriting (0 oldiga, 1 chapga, -1 o'ngga): ");
        int N = scanner.nextInt();

        char harakatlanish = tomon;

        switch (N) {
            case 0:
                harakatlanish = tomon;
                break;
            case 1:
                switch (tomon) {
                    case 'N': harakatlanish = 'W'; break;
                    case 'W': harakatlanish = 'S'; break;
                    case 'S': harakatlanish = 'E'; break;
                    case 'E': harakatlanish = 'N'; break;
                    default: System.out.println("Notogri yonalish: "); return;
                }
                break;
            case -1:
                switch (tomon) {
                    case 'N': harakatlanish = 'E'; break;
                    case 'E': harakatlanish = 'S'; break;
                    case 'S': harakatlanish = 'W'; break;
                    case 'W': harakatlanish = 'N'; break;
                    default: System.out.println("Notogri yonalish: "); return;
                }
                break;
            default:
                System.out.println("Notogri buyruq: ");
                return;
        }

        System.out.println("Yakuniy yonalish: " + harakatlanish);
    }
}