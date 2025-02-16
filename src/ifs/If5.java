package ifs;
import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uchta sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int counter1 = 0;
        int counter2 = 0;

        if (a > 0) {
            counter1++;
        } else if (a < 0){
            counter2++;
        }
        if (b > 0) {
            counter1++;
        } else if (b < 0){
            counter2++;
        }
        if (c > 0) {
            counter1++;
        } else if (c < 0){
            counter2++;
        }

        System.out.println("Musbat sonlar miqdori: " + counter1);
        System.out.println("Manfiy sonlar miqdori: " + counter2);
    }
}