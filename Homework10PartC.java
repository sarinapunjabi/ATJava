import java.util.Scanner;

public class Homework10PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter student name: ");
        String name = in.nextLine();

        int total = 0;

        // bug 1: min started at 0 so it never showed the real smallest score
        // int min = 0;
        int min = 100;

        int max = -1;
        final int COUNT = 4;

        for (int i = 1; i <= COUNT; i++) {
            System.out.print("enter score " + i + " (0-100): ");
            int s = in.nextInt();

            // bug 2: this used &&, which can never be true. a number can't be <0 and >100 at the same time
            // if (s < 0 && s > 100) {
            //     if (s < 0) s = 0;
            //     if (s > 100) s = 100;
            // }
            if (s < 0 || s > 100) {
                if (s < 0) {
                    s = 0;
                }
                if (s > 100) {
                    s = 100;
                }
            }

            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }

            total += s;
        }

        // bug 3: this did integer division first, losing decimals
        // double avg = (double) (total / COUNT);
        double avg = (double) total / COUNT;

        boolean passed = false;

        // bug 4: the semicolon after the if made the if useless and the block always ran
        // if (avg >= 60)
        //     ;
        // {
        //     passed = true;
        // }
        if (avg >= 60) {
            passed = true;
        }

        char letter = 'f';
        if (avg >= 90) {
            letter = 'a';
        } else if (avg >= 80) {
            letter = 'b';
        } else if (avg >= 70) {
            letter = 'c';
        } else if (avg >= 60) {
            letter = 'd';
        }

        System.out.println("\n----- report -----");
        System.out.println("name: " + name);
        System.out.println("highest score: " + max);
        System.out.println("lowest score: " + min);
        System.out.println("passed? " + passed);
        System.out.printf("average: %.2f\n", avg);
        System.out.println("letter grade: " + letter);

        in.close();
    }
}