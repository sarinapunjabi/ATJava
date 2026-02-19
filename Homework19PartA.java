import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Homework19PartA {
    public static void main(String[] args) {

        ArrayList<Integer> temps = new ArrayList<Integer>();
        int lowest = 0;

        try {
            Scanner in = new Scanner(new File("temps.txt"));
            if (in.hasNextInt()) {
                lowest = in.nextInt();
                temps.add(lowest);
            }

            while (in.hasNextInt()) {
                int num = in.nextInt();
                temps.add(num);

                if (num < lowest) {
                    lowest = num;
                }
            }

            in.close();
            for (int i = 0; i < temps.size(); i++) {
                int value = temps.get(i);

                if (value == lowest) {
                    System.out.println(value + " <= lowest");
                } else {
                    System.out.println(value);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}