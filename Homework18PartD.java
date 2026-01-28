import java.util.ArrayList;
import java.util.Scanner;

public class Homework18PartD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            System.out.print("enter an integer or q to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            }

            if (input.hasNextInt()) {
                nums.add(input.nextInt());
            } else {
                input.next();
            }
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) % 2 != 0) {
                nums.remove(i);
            }
        }

        for (int n : nums) {
            System.out.println(n);
        }

        input.close();
    }
}
