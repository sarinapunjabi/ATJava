import java.util.Scanner;

public class Homework9PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a phrase: ");
        String phrase = in.nextLine();
        int count = 0;
        for (int i = 0; i < phrase.length(); i++){
            char c = phrase.charAt(i);
            if (c == 'e') {
                count++;
            }
        }
        System.out.println("the letter 'e' appears " + count + " times.");
        in.close();
    }
} 
    

