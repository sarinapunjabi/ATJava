import java.util.ArrayList;
import java.util.Scanner;

public class Homework18PartA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.print("enter a name or # to quit: ");
            String name = input.nextLine();

            if (name.equals("#")) {
                break;
            }

            names.add(name);
        }

        for (String n : names) {
            System.out.println(n);
        }

        input.close();
    }
}