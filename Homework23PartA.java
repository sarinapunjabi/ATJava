import java.util.Scanner;

public class Homework23PartA {

    public static int quizScore(Scanner in) {
        String input = in.nextLine();

        int score = Integer.parseInt(input);
        if (score < 0 || score > 100) {
            throw new NumberFormatException();
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the quiz score (0–100): ");

        try {
            int score = quizScore(in);
            System.out.println("valid score: " + score);
        } catch (NumberFormatException e) {
            System.out.println("invalid score");
        }

        in.close();
    }
}