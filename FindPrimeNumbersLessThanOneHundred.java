public class FindPrimeNumbersLessThanOneHundred {
    public static boolean findPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    for (int i = 2; i <= 100; i++) {
        if(findPrime(i)) {
            System.out.println(i);
        }
    }
    }
}
