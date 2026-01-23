import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] scores = new double[10];
        int count = 0;
        double sum = 0;
        double max = 0;
        System.out.println("enter test scores (q to quit): ");

        while (count < 10){
            String userInput = input.nextLine();
            if (userInput.equals("q")) {
                break;
            }

            double score = Double.parseDouble(userInput);
            scores[count] = score;
            sum += score;

            if (count == 0 || score > max) {
                max = score;
            } count++;
        } if (count > 0) {
            double average = sum / count;
            System.out.println("total number of scores: " + count);
            System.out.println("average score: " + average);
            System.out.println("max score: " + max);
        } else {
            System.out.println("no scores were entered");
        }

        input.close();
    }
}