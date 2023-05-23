import java.util.Scanner;

public class DrawMenuLoop {
    public static void main(String[] args) {
        int choice = -1;
        int i, j, k, n;
        n = 5;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the square triangle");
            System.out.println("2. Print isosceles triangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 7; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("");
                    }
                case 2:
                    while (choice != 0) {
                        System.out.println("Menu");
                        System.out.println("1. The corner is square at top-left");
                        System.out.println("2. The corner is square at top-right");
                        System.out.println("3. The corner is square at bottom-left");
                        System.out.println("4. The corner is square at bottom-right");
                        System.out.println("0. Exit");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                for (i = n; i > 0; i--) {
                                    for (j = 0; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                for (i = n; i > 0; i--) {
                                    for (j = 0; j < n - i; j++) {
                                        System.out.print("");
                                    }
                                    for (k = 0; k < i; k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (i = 0; i < n; i++) {
                                    for (j = 0; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                for (i = 0; i < n; i++) {
                                    for (j = 0; j < n - i - 1; j++) {
                                        System.out.print("");
                                    }
                                    for (k = 0; k <= i; k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println("No choice!");
                            }
                        }
                    }
            }
        }
    }