import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework19PartB {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("quizzes.txt"));
            PrintWriter out = new PrintWriter("quizzesMod.txt");

            int number = 0;
            double total = 0;
            int count = 0;

            while (in.hasNext()) {
                if (in.hasNextDouble()) {
                    double score = in.nextDouble();

                    out.printf("Quiz %03d: %.2f%n", number, score);

                    total += score;
                    count++;
                    number++;
                } else {
                    in.next(); 
                }
            }
            out.println("----------------");

            if (count > 0){
                double average = total / count;
                out.printf("Average: %.2f%n", average);
            } else {
                out.println("Average: 0.00");
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}