import java.util.Scanner;

public class PartiallyFilledArraysPartB {
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

            // insert 100.0 at index 1
            count = insert(scores, count, 1, 100.0);

            // after it's inserted the sum and max are recalculated
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

    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {

        if (currentSize >= array.length) {
            return currentSize;
        }

        // the target index has to be within the bounds of the partially filled array 
        if (targetIndex < 0 || targetIndex > currentSize) {
            return currentSize;
        }

        // shift elements to the right to make room
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        // insert the new element
        array[targetIndex] = newElement;

        return currentSize + 1;
    }
}
