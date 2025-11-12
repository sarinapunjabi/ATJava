import java.util.Scanner;

public class CougarBaking4 {
    enum CustomerType { CHILD, ADULT, SENIOR }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is it? ");
        String day = input.next().toLowerCase();
        System.out.println("How old is the customer? ");
        int age = input.nextInt();
        System.out.println("How much does their meal cost? ");
        double cost = input.nextDouble();

        double discount = 0.0;
        CustomerType type;

        if (age < 13) {
            type = CustomerType.CHILD;
        } 
        else if (age >= 50) {
            type = CustomerType.SENIOR;
        } 
        else {
            type = CustomerType.ADULT;
        }
        if (day.equals("monday")) {
            if (type == CustomerType.CHILD) {
                discount = 0.075;
            } 
            else if (type == CustomerType.SENIOR) {
                discount = 0.15;
            } 
            else {
                discount = 0.05;
            }
        } 
        else {
            if (type == CustomerType.CHILD) {
                discount = 0.05;
            } 
            else if (type == CustomerType.SENIOR) {
                discount = 0.075;
            } 
            else {
                discount = 0.0;
            }
        }

        double total = cost - (cost * discount);
        System.out.println("Customer type is: " + type);
        System.out.println("Their total is $" + total);

        input.close();
    }
}