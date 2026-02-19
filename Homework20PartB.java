import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework20PartB {
    public static void main(String[] args) {

        int count = 0;
        int letters = 0;
        int digits = 0;

        try {
            Scanner in = new Scanner(new File("character.txt"));

         while (in.hasNextLine()) {
                String line = in.nextLine();

                for (int i = 0; i < line.length(); i++){
                    char ch = line.charAt(i);

                    System.out.print(ch);
                    count++;

                    if (Character.isLetter(ch)) {
                        letters++;
                    }

                    if (Character.isDigit(ch)) {
                        digits++;
                    }
                }

                System.out.println();
            }

            in.close();

            System.out.println("count = " + count);
            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}
