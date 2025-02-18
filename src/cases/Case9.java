package cases;
import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kunni kiriting: ");
        int kun = scanner.nextInt();

        System.out.print("Oyni kiriting: ");
        int oy = scanner.nextInt();

        int[] kunlar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (oy < 1 || oy > 12 || kun < 1 || kun > kunlar[oy - 1]) {
            System.out.println("Notogri sana kiritildi: ");
            return;
        }
        switch (oy) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (kun < 31) {
                    kun++;
                } else {
                    kun = 1;
                    oy++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (kun < 30) {
                    kun++;
                } else {
                    kun = 1;
                    oy++;
                }
                break;
            case 2:
                if (kun < 28) {
                    kun++;
                } else {
                    kun = 1;
                    oy++;
                }
                break;
            case 12:
                if (kun < 31) {
                    kun++;
                } else {
                    kun = 1;
                    oy = 1;
                }
                break;
        }

        System.out.println("Keyingi sana: " + kun + " kun " + oy + " oy ");
    }
}