import java.util.Scanner;

public class Homework25PartB {

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       CashRegister cr = new CashRegister();

       boolean running = true;

       while (running) {

           System.out.println("Enter price, t (total), d (delete), c (clear), q (quit)");
           String input = in.next();

           if (input.equals("q")) {
               running = false;
           }

           else if (input.equals("t")) {
               System.out.println("items: " + cr.getCount());
               System.out.printf("total: $%.2f%n", cr.getTotal());
           }

           else if (input.equals("d")) {
               cr.removeItem();
           }

           else if (input.equals("c")) {
               cr.clear();
           }

           else {
               try {
                   double price = Double.parseDouble(input);
                   cr.addItem(price);
               } catch (NumberFormatException e) {
                   System.out.println("invalid");
               }
           }
       }

       in.close();
   }
}