package cases;
import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 dan 5 gacha son kiriting: ");
        int son = scanner.nextInt();

        System.out.print("Massa kiriting: ");
        double massa = scanner.nextDouble();

        double kilogram = 0;

        switch (son) {
            case 1:
                kilogram = massa;
                break;
            case 2:
                kilogram = massa * 0.000001;
                break;
            case 3:
                kilogram = massa * 0.001;
                break;
            case 4:
                kilogram = massa * 1000;
                break;
            case 5:
                kilogram = massa * 100;
                break;
            default:
                System.out.println("Notogri son kiritildi: ");
                return;
        }

        System.out.println("Massa kilogramda: " + kilogram);
    }
}