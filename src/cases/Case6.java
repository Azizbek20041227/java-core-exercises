package cases;
import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 dan 5 gacha son kiriting: ");
        int son = scanner.nextInt();

        System.out.print("Uzunlikni kiriting: ");
        int uzunlik = scanner.nextInt();

        int uzunlikdagimetr = 0;

        switch (son) {
            case 1:
                uzunlikdagimetr = uzunlik / 10;
                break;
            case 2:
                uzunlikdagimetr = uzunlik * 1000;
                break;
            case 3:
                uzunlikdagimetr = uzunlik;
                break;
            case 4:
                uzunlikdagimetr = uzunlik / 1000;
                break;
            case 5:
                uzunlikdagimetr = uzunlik / 100;
                break;
            default:
                System.out.println("Notogri son kiritildi: ");
                return;
        }

        System.out.println("Uzunlik metrda: " + uzunlikdagimetr);
    }
}