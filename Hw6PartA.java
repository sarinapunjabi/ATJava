// I had to look up how to convert from F to C
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("temperature: ");
        double temp = input.nextDouble();

        System.out.print("Celsius (C) or Fahrenheit (F): ");
        String scale = input.next().toUpperCase();

        if (scale.equals("F")){
            temp = ((temp - 32) * 5) / 9;
        }

        if (temp <= 0){
            System.out.println("water is ice (solid)");
        } else if (temp >= 100){
            System.out.println("water is steam (gas)");
        } else {
            System.out.println("water is in liquid state");
        }

        input.close();
    }
}