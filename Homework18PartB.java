import java.util.ArrayList;
import java.util.Scanner;

public class Homework18PartB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        while (true) {
            System.out.print("enter a test score or q to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            }

            if (input.hasNextDouble()) {
                scores.add(input.nextDouble());
            } else {
                input.next();
            }
        }

        double sum = 0;

        for (double s : scores) {
            System.out.printf("%.2f%n", s);
            sum += s;
        }

        if (scores.size() > 0) {
            System.out.printf("average: %.2f%n", sum / scores.size());
        }

        input.close();
    }
}