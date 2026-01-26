import java.util.Arrays;
import java.util.Scanner;

public class Homework15PartA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[10];
        int size = 0;

        while (size < values.length) {
            System.out.print("enter an integer value or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            }
            if (input.hasNextInt()) {
                values[size] = input.nextInt();
                size++;
            } else {
                input.next();
            }
        }

        System.out.print("*");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        Arrays.sort(values, 0, size);

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        input.close();
    }
}