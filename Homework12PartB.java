public class Homework12PartB {
    public static void main(String[] args) {
        System.out.println(smallest(5.1, 2.3, 1.8));
        System.out.println(smallest(6.7, -3.2, 12.2929));
        System.out.println(smallest(7.0, 123.0, -2.8));
    }

    public static double smallest(double x, double y, double z) {
        double smallest = x;
        if (y < smallest) {
            smallest = y;
        }
        if (z < smallest) {
            smallest = z;
        }
        return smallest;
    }
}