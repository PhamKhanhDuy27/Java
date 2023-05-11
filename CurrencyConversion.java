import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int rate, Usd, Vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        Usd = scanner.nextInt();
        rate = 23000;
        Vnd = Usd * rate;
        System.out.printf("Conversion: " + Vnd + " VND");
    }
}
