import java.util.Scanner;

public class Homework15PartB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[20];
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

        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("enter a target integer value: ");
        int target = input.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] == target) {
                count++;
            }
        }

        System.out.println("the value " + target + " occurs " + count + " times in your original data set.");

        input.close();
    }
}
