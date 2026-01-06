import java.util.Scanner;

public class ProgressBar {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter an integer 0 to 20: ");
        int value = in.nextInt();
        System.out.print("Progress: [");

        for (int i = 0; i < value; i++) {
            System.out.print("#");
        }

        for (int i = value; i < 20; i++) {
            System.out.print("-");
        }

        System.out.print("] ");
        System.out.println(value * 5 + "%");
    }
}