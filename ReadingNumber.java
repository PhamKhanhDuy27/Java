import java.util.Scanner;

public class ReadingNumber {
    public static void lessThan10(int number) {
        String x = "";
        switch (number) {
            case 0:
                x = "Zero";
                break;
            case 1:
                x = "ones";
                break;
            case 2:
                x = "two";
                break;
            case 3:
                x = "three";
                break;
            case 4:
                x = "four";
                break;
            case 5:
                x = "five";
                break;
            case 6:
                x = "six";
                break;
            case 7:
                x = "seven";
                break;
            case 8:
                x = "eight";
                break;
            case 9:
                x = "nine";
                break;
            default:
                x = "out of ability";
                break;
        }
        System.out.printf(x);
    }
    public static void lessThan20(int number) {
        String x = "";
        int ones = number - 10;
        switch (ones) {
            case 0:
                x = "ten";
                break;
            case 1:
                x = "eleven";
                break;
            case 2:
                x = "twelve";
                break;
            case 3:
                x = "thirteen";
                break;
            case 4:
                x = "fourteen";
                break;
            case 5:
                x = "fifteen";
                break;
            case 6:
                x = "sixteen";
                break;
            case 7:
                x = "seventeen";
                break;
            case 8:
                x = "eighteen";
                break;
            case 9:
                x = "nineteen";
                break;
        }
        System.out.printf(x);
    }
    public static void lessThan100(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String x = "", y = "";
        switch (tens) {
            case 2:
                x = "twenty";
                break;
            case 3:
                x = "thirty";
                break;
            case 4:
                x = "forty";
                break;
            case 5:
                x = "fifty";
                break;
            case 6:
                x = "sixty";
                break;
            case 7:
                x = "seventy";
                break;
            case 8:
                x = "eighty";
                break;
            case 9:
                x = "nine";
                break;
        }
        switch (ones) {
            case 0:
                y = "";
                break;
            case 1:
                y = "one";
                break;
            case 2:
                y = "two";
                break;
            case 3:
                y = "three";
                break;
            case 4:
                y = "four";
                break;
            case 5:
                y = "fine";
                break;
            case 6:
                y = "six";
                break;
            case 7:
                y = "seven";
                break;
            case 8:
                y = "eight";
                break;
            case 9:
                y = "nine";
                break;
        }
        System.out.printf(x + " " + y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            lessThan10(number);
        }
        else if (number < 20) {
            lessThan20(number);
        }
        else if (number < 100) {
            lessThan100(number);
        }
        else if (number < 1000) {
            int hundred = number / 100;
            int tens = number % 100;
            String z = "";
            switch (hundred) {
                case 1:
                    z = "one hundred";
                    break;
                case 2:
                    z = "two hundred";
                    break;
                case 3:
                    z = "three hundred";
                    break;
                case 4:
                    z = "four hundred";
                    break;
                case 5:
                    z = "five hundred";
                    break;
                case 6:
                    z = "six hundred";
                    break;
                case 7:
                    z = "seven hundred";
                    break;
                case 8:
                    z = "eight hundred";
                    break;
                case 9:
                    z = "nine hundred";
                    break;
            }
            if (tens < 10) {
                System.out.printf(z + " ");
                lessThan10(tens);
            }
            if (tens < 20) {
                System.out.printf(z + " ");
                lessThan20(tens);
            }
            if (tens < 100) {
                System.out.printf(z + " ");
                lessThan100(tens);
            }
        }
        else {
            System.out.printf("out of ability");
        }
    }
}