import java.util.Scanner;
public class Homework24PartA {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("whats your name: ");
        String name = in.nextLine();
        System.out.println("name: " + name);
        System.out.print("whats your age: ");
        int age = in.nextInt();
        System.out.println("age: " + age);

        in.close();
    }
}