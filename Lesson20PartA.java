import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson20PartA {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("customerdata.txt"));
            in.useDelimiter("[,\\s\\n]+");

            System.out.println("------------------------------------");
            System.out.println("   ID  |    Name     |     Balance ");
            System.out.println("------------------------------------");

         while (in.hasNext()) {
                int id = in.nextInt();
                String name = in.next();
                double balance = in.nextDouble();

                System.out.printf("%06d | %12s | $%15.2f%n", id, name, balance);
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}
