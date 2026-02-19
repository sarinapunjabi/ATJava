import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework21PartB {
    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(new File("sales_by_cat.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();

                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",\\s*");

                String dept = lineScan.next();
                String manager = lineScan.next();
                String salesText = lineScan.next();

                double sales = 0.0;
                if (!salesText.equals("n/a")){
                    sales = Double.parseDouble(salesText);
                }

                System.out.printf("%-17s | %-10s | $%9.2f%n", dept, manager, sales);

                lineScan.close();
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}