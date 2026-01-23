import java.util.Scanner;

public class PartiallyFilledArraysPartA {
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
            }
            count++;
        }

        if (count > 0) {
            // remove the element at index 1
            count = remove(scores, count, 1);

            // after it's removed, sum and max are recalculated 
            sum = 0;
            max = scores[0];
            for (int i = 0; i < count; i++) {
                sum += scores[i];
                if (scores[i] > max) {
                    max = scores[i];
                }
            }

            double average = sum / count;
            System.out.println("total number of scores: " + count);
            System.out.println("average score: " + average);
            System.out.println("max score: " + max);

        } else {
            System.out.println("no scores were entered");
        }

        input.close();
    }
    public static int remove(double[] array, int currentSize, int targetIndex) {

        if (targetIndex < 0 || targetIndex >= currentSize) {
            return currentSize;
        }

        for (int i = targetIndex; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
        }

        return currentSize - 1;
    }
}
