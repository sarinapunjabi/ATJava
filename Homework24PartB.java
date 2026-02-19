import java.util.Scanner;

public class Homework24PartB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // one counter per dessert
        Counter cake = new Counter();
        Counter pie = new Counter();

        System.out.println("Enter c for cake, p for pie, q to quit.");

        String input = in.next();

        while (!input.equals("q")) {

            if (input.equals("c")) {
                cake.increment();
            }
            else if (input.equals("p")) {
                pie.increment();
            }

            input = in.next();
        }

        // display totals
        System.out.println("Total votes for cake: " + cake.getCount());
        System.out.println("Total votes for pie: " + pie.getCount());

        in.close();
    }
}