// you need a precision value 
public class Precision {
    public static void main(String[] args) {
        double a = 1.2; 
        double b = 3.0;
        double c = a * b;
        double threshold = 0.000001;

        if (Math.abs(c - 3.6) < threshold) {
            System.out.println("c is 3.6");
        } else {
            System.out.println("c is not 3.6");
        }
    }

}