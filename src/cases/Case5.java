package cases;
import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting (1-qo‘shish, 2-ayirish, 3-ko‘paytirish, 4-bo‘lish): ");
        int son = scanner.nextInt();

        System.out.println("Ikkita haqiqiy sonni kiriting: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int natija;
        switch (son) {
            case 1:
                natija = A + B;
                System.out.println("Natija: " + natija);
                break;
            case 2:
                natija = A - B;
                System.out.println("Natija: " + natija);
                break;
            case 3:
                natija = A * B;
                System.out.println("Natija: " + natija);
                break;
            case 4:
                if (B != 0) {
                    natija = A / B;
                    System.out.println("Natija: " + natija);
                } else {
                    System.out.println("Xatolik: 0 ga bo‘lish mumkin emas");
                }
                break;
            default:
                System.out.println("Notogri son kiritildi");
        }
    }
}