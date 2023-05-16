import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        }
        while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int X;
        System.out.println("Enter X: ");
        X = scanner.nextInt();
        int index_del = -1;
        for (int k = 0; k < array.length; k++) {
            if (X == array[k]) {
                index_del = k;
                array[k] = 0;
                break;
            }
        }
        for (int l = index_del; l < array.length; l++) {
                int temp = array[index_del + 1];
                array[index_del + 1] = array[l];
                array[l] = temp;
            }
        System.out.println(Arrays.toString(array));
        }
    }
