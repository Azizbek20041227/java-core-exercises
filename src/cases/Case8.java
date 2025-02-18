package cases;
import java.util.Scanner;

public class Case8 {
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

        if (kun > 1) {
            kun--;
        } else {
            switch (oy) {
                case 2: case 4: case 6: case 8: case 9: case 11:
                    kun = 31;
                    oy--;
                    break;
                case 5: case 7: case 10: case 12:
                    kun = 30;
                    oy--;
                    break;
                case 3:
                    kun = 28;
                    oy = 2;
                    break;
                case 1:
                    kun = 31;
                    oy = 12;
                    break;
            }
        }

        System.out.println("Oldingi sana: " + kun + " kun " + oy + " oy ");
    }
}