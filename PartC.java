import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three strings: ");
        String a = input.next();
        String b = input.next();
        String c = input.next();
        if (a.compareTo(b) > 0){
            String first = a;
            a = b;
            b = first;
        }
        if (a.compareTo(c) > 0){
            String first = a;
            a = c;
            c = first;
        }

        if (b.compareTo(c) > 0) {
            String first = b;
            b = c;
            c = first;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        input.close();
    }
}