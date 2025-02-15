package integers;
import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ikki honali son : ");
        int Ikki = scanner.nextInt();

        int Chapdagionlikson = Ikki / 10;
        double Ongdagibirlikson = Ikki % 10;

        System.out.println("Chapdagi onlik son : " + Chapdagionlikson);
        System.out.println("Ongdagi birlik son : " + Ongdagibirlikson);
    }
}