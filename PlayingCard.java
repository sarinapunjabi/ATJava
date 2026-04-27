public class Mower {
    public static void main(String[] args) {

        int feet = 100;
        int rate = 20;
        int time = feet / rate;

        System.out.println("yard length: " + feet + " feet");
        System.out.println("mower speed: " + rate + " feet per minute");
        System.out.println("time to mow: " + time + " minutes");
    }
}
