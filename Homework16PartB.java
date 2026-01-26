import java.util.Arrays;

public class Homework16PartB {

    public static double average(double... values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    public static void main(String[] args) {

        System.out.println(average(10, 8, 9));

        double[] scores = {100, 90, 80, 100, 80};
        System.out.println(average(scores));

        double[] partial = new double[10];
        int size = 5;

        partial[0] = 100;
        partial[1] = 90;
        partial[2] = 80;
        partial[3] = 100;
        partial[4] = 80;

        double[] copy = Arrays.copyOf(partial, size);
        System.out.println(average(copy));
    }
}
