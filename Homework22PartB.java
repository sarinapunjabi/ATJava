import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework22PartB {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("birthyears.txt"));
            while (in.hasNextLine()) {

                String line = in.nextLine();
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String name = lineScan.next();
                String yearText = lineScan.next();

                try {
                    int year = Integer.parseInt(yearText);
                    System.out.println(name + " was born in " + year + ".");
                } catch (NumberFormatException e) {
                    System.out.println("i do not know what year " + name + " was born");
                }

                lineScan.close();
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}