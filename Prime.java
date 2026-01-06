import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("pick an integer: ");
        int num = in.nextInt();
        boolean prime = true;

        if (num <= 1){
            prime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }

        if (prime)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " isn't prime");
    }
}