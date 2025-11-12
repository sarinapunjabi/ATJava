import java.util.Scanner;

public class Project {
    enum CustomerType { BABY, CHILD, ADULT, SENIOR }
    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("name: ");
        String firstName = input.next();
        String lastName = input.next();

        System.out.print("day: ");
        String dayText = input.next().toLowerCase();
        Day day = null; 

        if (dayText.startsWith("mon")) {
            day = Day.MON;
        } else if (dayText.startsWith("tue")) {
            day = Day.TUE;
        } else if (dayText.startsWith("wed")) {
            day = Day.WED;
        } else if (dayText.startsWith("thu")) {
            day = Day.THU;
        } else if (dayText.startsWith("fri")) {
            day = Day.FRI;
        } else if (dayText.startsWith("sat")) {
            day = Day.SAT;
        } else if (dayText.startsWith("sun")) {
            day = Day.SUN;
        } else {
            System.err.println("error");
        }

        System.out.print("time: ");
        String time = input.next();
        if (!time.contains(":")) {
            System.err.println("error");
        }

        String hourPart = time.substring(0, time.indexOf(':'));
        String minutePart = time.substring(time.indexOf(':') + 1);
        int hour = Integer.parseInt(hourPart);
        int minute = Integer.parseInt(minutePart);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.err.println("error");
        }

        System.out.print("age: ");
        if (!input.hasNextInt()) {
            System.err.println("error");
        }
        int age = input.nextInt();
        if (age < 0) {
            System.err.println("error");
        }

        System.out.print("student (y/n)?: ");
        String studentText = input.next().toLowerCase();
        boolean student = false; 
        if (studentText.equals("y")) {
            student = true;
        } else if (studentText.equals("n")) {
            student = false;
        } else {
            System.err.println("error");
        }

        CustomerType type;
        if (age <= 2) {
            type = CustomerType.BABY;
        } else if (age <= 12) {
            type = CustomerType.CHILD;
        } else if (age <= 59) {
            type = CustomerType.ADULT;
        } else {
            type = CustomerType.SENIOR;
        }

        boolean weekend = (day == Day.SAT || day == Day.SUN);
        boolean rush = (!weekend) && ((hour == 6 || hour == 7) || (hour == 16 || hour == 17));

        double base;
        if (weekend) {
            base = 80.00;
        } else if (rush) {
            base = 100.00;
        } else {
            base = 90.00;
        }

        double ageDiscount = 0.00;
        if (type == CustomerType.CHILD) {
            ageDiscount = base * 0.20;
        } else if (type == CustomerType.SENIOR) {
            ageDiscount = base * 0.25;
        }

        double afterAgeDiscount = base - ageDiscount;
        double studentDiscount = 0.00;
        if (student && type != CustomerType.BABY) {
            studentDiscount = afterAgeDiscount * 0.05;
        }

        double finalCost;
        if (type == CustomerType.BABY) {
            finalCost = 0.00;
        } else {
            finalCost = afterAgeDiscount - studentDiscount;
        }

        String fullName = firstName + " " + lastName;
        System.out.println();

        System.out.printf("%-20s%s%n", "Name:", fullName);
        System.out.printf("%-20s%s%n", "Day:", day);
        System.out.printf("%-20s%02d:%02d%n", "Time:", hour, minute);
        System.out.printf("%-20s$%10.2f%n", "Base Price:", base);
        System.out.printf("%-20s$%10.2f (%s)%n", "Age Discount:", -ageDiscount, type);
        System.out.printf("%-20s$%10.2f%n", "Student Discount:", -studentDiscount);
        System.out.printf("%-20s$%10.2f%n", "Final Cost:", finalCost);

        input.close();
    }
}