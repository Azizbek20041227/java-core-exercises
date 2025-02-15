package integers;
import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Soniya : ");
        int Soniya = scanner.nextInt();

        int Daqiqa = Soniya / 60;

        System.out.println("Daqiqa : " + Daqiqa);
    }
}