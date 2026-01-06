import java.util.Scanner;

public class Challenge1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("enter a word: ");
      String word = in.nextLine();
      word = word.toLowerCase();

      for (int i = 0; i < word.length() / 2; i++) {
         if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
            System.out.println("this word is not a palindrome");
            in.close();
            return;
         }
      }

      System.out.println("it is a palindrome");
      in.close();
   }
}