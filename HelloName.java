import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name, hello, communication;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        hello = "Hello";
        communication = hello + ": " + name;
        System.out.println(communication);
    }
}
