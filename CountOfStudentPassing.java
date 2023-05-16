import java.util.Arrays;
import java.util.Scanner;

public class CountOfStudentPassing {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        }
        while (size > 10);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("List of entry scores of " + size + " student: " + Arrays.toString(array));
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of students passing the exam is " + count);
    }
}
