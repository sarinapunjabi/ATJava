import java.util.Scanner;

public class Homework16PartA {

    public static void cleanup(String[] arr, int size) {
        for (int i = 0; i < size; i++) {
            String s = arr[i].trim().toLowerCase();
            if (s.length() > 0) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
            }
            arr[i] = s;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[20];
        int size = 0;

        while (size < words.length) {
            System.out.print("enter a word or phrase or 'q' to quit: ");
            String line = input.nextLine();

            if (line.equalsIgnoreCase("q")) {
                break;
            }

            words[size] = line;
            size++;
        }

        System.out.println("words/phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }

        cleanup(words, size);

        System.out.println("modified array...");
        System.out.println("words/phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }

        input.close();
    }
}