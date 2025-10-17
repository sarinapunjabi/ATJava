import java.util.Scanner;

public class CougarBaking2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double price = 0.99;
    System.out.println("Cookies are $0.99, how many do you want?");
    int cookies = input.nextInt();

    double total = cookies * price;
    if (cookies > 24) {
        double discount =  0.15;
        total = total - (total * discount);
        System.out.println("You get a 15% discount, your price is " + total);
    }
        else if (cookies > 12) {
            double discount =  0.05;
            total = total - (total * discount);
            System.out.println("You get a 5% discount, your price is " + total);
        }

        else if (cookies > 6) {
            double discount =  0.025;
            total = total - (total * discount);
            System.out.println("You get a 2.5% discount, your price is " + total);

        }

    else {
    System.out.println("Your total is $" + total);
        } 
input.close();
    }
}
