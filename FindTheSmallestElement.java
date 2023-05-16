import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        }
        while (size > 10);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.print("The smallest element in the array: " + min);
    }
}
