import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the annual interest rate (APR) percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter the initial balance: ");
        double balance = input.nextDouble();
        System.out.println();
        System.out.println("Year Interest Balance");

        for (int year = 1; year <= 5; year++){
            double interest = balance * (rate / 100);
            balance = balance + interest;
            System.out.printf("%d %.2f %.2f%n", year, interest, balance);
        }

        input.close();
    }
}