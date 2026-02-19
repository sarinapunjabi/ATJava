import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework22PartA {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.print("enter a filename or enter # to quit: ");
            String filename = keyboard.nextLine();

            if (filename.equals("#")) {
                System.out.println("goodbye");
                break;
            }

            try {
                Scanner fileScan = new Scanner(new File(filename));

                while (fileScan.hasNext()) {
                    String word = fileScan.next();
                    System.out.println(word);
                }

                fileScan.close();
                break;

            } catch (FileNotFoundException e) {
                System.out.println("error");
            }
        }
        keyboard.close();
    }
}