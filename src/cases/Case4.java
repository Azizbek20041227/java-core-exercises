package cases;
import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 12 gacha son kiriting: ");

        int oy = scanner.nextInt();

        int kun;

        switch (oy) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                kun = 31;
                break;
            case 4: case 6: case 9: case 11:
                kun = 30;
                break;
            case 2:
                kun = 28;
                break;
            default:
                System.out.println("Notogri son kiritildi: ");
                return;
        }

        System.out.println("Bu oyda " + kun + " kun bor: ");
    }
}