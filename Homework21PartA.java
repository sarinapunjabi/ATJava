import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework21PartA {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("top5unemployment.txt"));

            System.out.println("------------------------------------------------");
            System.out.println("Top 5 Unemployment Rates");
            System.out.println("------------------------------------------------");

            while (in.hasNextLine()) {
                String line = in.nextLine();

                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",\\s*");

                String country = lineScan.next();
                double rate = Double.parseDouble(lineScan.next());
                int rank = Integer.parseInt(lineScan.next());
                String region = lineScan.next();

                System.out.printf("Ranked # %2d: %-16s | %6.2f%% | %-20s%n", rank, country, rate, region);

                lineScan.close();
            }

            System.out.println("--------------------------------------------");

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}