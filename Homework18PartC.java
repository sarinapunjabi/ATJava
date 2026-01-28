import java.util.ArrayList;
import java.util.Scanner;

public class Homework18PartC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<>();

        while (true) {
            System.out.print("enter a temperature or q to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            }

            if (input.hasNextInt()) {
                temps.add(input.nextInt());
            } else {
                input.next();
            }
        }

        int lowest = temps.get(0);
        for (int t : temps) {
            if (t < lowest) {
                lowest = t;
            }
        }

        for (int t : temps) {
            if (t == lowest) {
                System.out.println(t + " <= lowest");
            } else {
                System.out.println(t);
            }
        }

        input.close();
    }
}
