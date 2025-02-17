package cases;
import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 5 gacha son kiriting: ");

        int baho = scanner.nextInt();

        switch (baho) {
            case 1:
                System.out.println("Yomon");
                break;
            case 2:
                System.out.println("Qoriqarsiz");
                break;
            case 3:
                System.out.println("Ortacha");
                break;
            case 4:
                System.out.println("Yaxshi");
                break;
            case 5:
                System.out.println("A'lo");
                break;
            default:
                System.out.println("Notogri son kiritildi: ");
        }
    }
}