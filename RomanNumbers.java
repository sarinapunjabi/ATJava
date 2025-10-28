import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer (1 - 3999): ");
        int number = input.nextInt();

        if (number <= 1 && number >= 3999) {
            System.out.println("Enter a number from 1 to 3999");
        } 
        else {
            String roman = "";
            while (number >= 1000) {
                roman = roman + "M";
                number = number - 1000;
            }
            if (number >= 900) {
                roman = roman + "CM";
                number = number - 900;
            } 
            else if (number >= 500) {
                roman = roman + "D";
                number = number - 500;
                while (number >= 100) {
                    roman = roman + "C";
                    number = number - 100;
                }
            } 
            else if (number >= 400) {
                roman = roman + "CD";
                number = number - 400;
            } 
            else {
                while (number >= 100) {
                    roman = roman + "C";
                    number = number - 100;
                }
            }
            if (number >= 90) {
                roman = roman + "XC";
                number = number - 90;
            } 
            else if (number >= 50) {
                roman = roman + "L";
                number = number - 50;
                while (number >= 10) {
                    roman = roman + "X";
                    number = number - 10;
                }
            } 
            else if (number >= 40) {
                roman = roman + "XL";
                number = number - 40;
            } 
            else {
                while (number >= 10) {
                    roman = roman + "X";
                    number = number - 10;
                }
            }
            if (number == 9) {
                roman = roman + "IX";
                number = number - 9;
            } 
            else if (number >= 5) {
                roman = roman + "V";
                number = number - 5;
                while (number >= 1) {
                    roman = roman + "I";
                    number = number - 1;
                }
            } 
            else if (number == 4) {
                roman = roman + "IV";
                number = number - 4;
            } 
            else {
                while (number >= 1) {
                    roman = roman + "I";
                    number = number - 1;
                }
            }

            System.out.println("Roman numeral: " + roman);
        }

        input.close();
    }
}