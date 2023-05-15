import java.util.Scanner;

public class FindTwentyPrimes {
    public static boolean findPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < n) {
            if (findPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
