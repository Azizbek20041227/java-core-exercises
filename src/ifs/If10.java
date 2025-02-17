package ifs;
import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b) {
           int summa = a + b;
           a = summa;
           b = summa;
        } else {
            a = 0;
            b = 0;
        }

        System.out.println("A yangi qiymati: " + a);
        System.out.println("B yangi qiymati: " + b);
    }
}