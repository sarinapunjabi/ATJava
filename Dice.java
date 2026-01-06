import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1;
        int die2;

        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            System.out.println("die 1: " + die1);
            System.out.println("die 2: " + die2);
            System.out.println();

        } 
        while (die1 != die2);

        System.out.println("the dice matched");
    }
}
