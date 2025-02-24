package strings;
import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Biror belgi kiriting: ");
        char belgi = scanner.next().charAt(0);

        int sonqiymati = (int) belgi;
        System.out.println("Belgining Unicode qiymati: " + sonqiymati);
    }
}