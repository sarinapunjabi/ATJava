import java.util.Scanner;

public class CougarBaking3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is it? ");        
        String day = input.next().toLowerCase();
        System.out.println("How old is the customer? ");
        int age = input.nextInt();
        System.out.println("How much does their meal cost? ");
        double cost = input.nextDouble();

        double discount = 0.0;

        if (day.equals("monday")) {
            if (age < 13) {
                discount = 0.075;   
            } 
            else if (age >= 50) {
                discount = 0.15;     
            } 
            else {
                discount = 0.05;    
            }
        } 
        else {
            if (age < 13) {
                discount = 0.05;   
            } 
            else if (age >= 50) {
                discount = 0.075;   
            } 
        }

        double total = cost - (cost * discount);
        System.out.println("The final total is $" + total); 

        input.close();
    }
}






