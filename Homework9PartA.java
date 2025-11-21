import java.util.Scanner;

public class Homework9PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double value;
        System.out.println("enter test scores or enter a negative number to stop");

        do {
            System.out.print("enter a score: ");
            value = in.nextDouble();
            if (value >= 0){
                total += value;
                count++;
            }
        } while (value >= 0);
        if (count > 0){
            double avg = total / count;
            System.out.println("number of scores entered: " + count);
            System.out.printf("average score: %.2f\n", avg);
        } else{
            System.out.println("no scores");
        }

        in.close();
    }
}