import java.util.Arrays;
import java.util.Random;

public class Homework15PartC {

    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 10000;

        int[] values = new int[n];
        Random rand = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(n) + 1;
        }

        int[] sorted = Arrays.copyOf(values, values.length);
        Arrays.sort(sorted);

        int trials = 10;

        for (int t = 1; t <= trials; t++) {
            int target = rand.nextInt(n) + 1;

            long startLinear = System.nanoTime();
            int linIndex = linearSearch(values, target);
            long endLinear = System.nanoTime();

            long startBinary = System.nanoTime();
            int binIndex = Arrays.binarySearch(sorted, target);
            long endBinary = System.nanoTime();

            System.out.println("target value: " + target);
            System.out.println("linear search index: " + linIndex + " time: " + (endLinear - startLinear));
            System.out.println("binary search index: " + binIndex + " time: " + (endBinary - startBinary));
            System.out.println();
        }

        System.out.println("binary search is faster for large arrays");
        System.out.println("linear search slows down as array size increases");
    }
}













