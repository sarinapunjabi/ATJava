public class Homework9PartC {
    public static void main(String[] args) {
        int count = 10;
        int total = 0;
        for (int i = 0; i < count; i++){
            int num = (int)(Math.random() * 10) + 1;
            System.out.println(num);
            total += num;
        }

        double avg = (double) total / count;
        System.out.println("average = " + avg);
    }
}

// when int count = 1000;
// when i changed the loop to 1000 numbers, the average came out close to 5.5 which makes sense because the numbers are randomly chosen from 1 to 10, and the middle of that range is about 5.5, so with more numbers, the average gets closer to that value