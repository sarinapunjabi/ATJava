import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int value;

    public Dice() {
        value = 1;
    }

    public Dice(int startValue) {
        value = startValue;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void display() {
        if (value == 1) {
            System.out.println(" ----- ");
            System.out.println("|     |");
            System.out.println("|  o  |");
            System.out.println("|     |");
            System.out.println(" ----- ");
        }

        if (value == 2) {
            System.out.println(" ----- ");
            System.out.println("|o    |");
            System.out.println("|     |");
            System.out.println("|    o|");
            System.out.println(" ----- ");
        }

        if (value == 3) {
            System.out.println(" ----- ");
            System.out.println("|o    |");
            System.out.println("|  o  |");
            System.out.println("|    o|");
            System.out.println(" ----- ");
        }

        if (value == 4) {
            System.out.println(" ----- ");
            System.out.println("|o   o|");
            System.out.println("|     |");
            System.out.println("|o   o|");
            System.out.println(" ----- ");
        }

        if (value == 5) {
            System.out.println(" ----- ");
            System.out.println("|o   o|");
            System.out.println("|  o  |");
            System.out.println("|o   o|");
            System.out.println(" ----- ");
        }

        if (value == 6) {
            System.out.println(" ----- ");
            System.out.println("|o   o|");
            System.out.println("|o   o|");
            System.out.println("|o   o|");
            System.out.println(" ----- ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dice d = new Dice();
        String choice = "";

        while (!choice.equals("q")) {
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            choice = input.nextLine();

            if (choice.equals("r")) {
                d.roll();
                System.out.println("die was rolled. value = " + d.getValue());
            }

            if (choice.equals("d")) {
                d.display();
            }
        }

        System.out.println("Bye!");
    }
}