public class Homework17PartB {

    public static void print(int[][] values) {
        for (int r = 0; r < values.length; r++) {
            for (int c = 0; c < values[r].length; c++) {
                System.out.print(values[r][c]);
                if (c < values[r].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] first = {
                {8, 6, 7},
                {5, 3, 0}
        };

        int[][] second = {
                {0, 7, 6, 5},
                {2, 2, 0, 1},
                {8, 4, 5, 7}
        };

        System.out.println("first array:");
        print(first);
        System.out.println();
        System.out.println("second array:");
        print(second);
    }
}