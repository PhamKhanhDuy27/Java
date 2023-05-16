import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[] arrayOne;
        int[] arrayTwo;
        int[] array;
        int sizeOne;
        int sizeTwo;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a sizeOne: ");
            sizeOne = input.nextInt();
            if (sizeOne > 5) {
                System.out.println("Size should not exceed 5");
            }
        }
        while (sizeOne > 5);
        arrayOne = new int[sizeOne];
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arrayOne[i] = input.nextInt();
        }
        System.out.println("Array 1: " + Arrays.toString(arrayOne));
        do {
            System.out.print("Enter a sizeTwo: ");
            sizeTwo = input.nextInt();
            if (sizeTwo > 5) {
                System.out.println("Size should not exceed 5");
            }
        }
        while (sizeTwo > 5);
        arrayTwo = new int[sizeTwo];
        for (int j = 0; j < arrayTwo.length; j++) {
            System.out.print("Enter element " + (j + 1) + " : ");
            arrayTwo[j] = input.nextInt();
        }
        System.out.println("Array 2: " + Arrays.toString(arrayTwo));
        array = new int[sizeOne + sizeTwo];
        for (int i = 0; i < arrayOne.length; i++ ) {
            array[i] = arrayOne[i];
        }
        for (int j = 0; j < arrayTwo.length; j++) {
            array[j + arrayOne.length] = arrayTwo[j];
        }
        System.out.println("Array : " + Arrays.toString(array));
    }
}
