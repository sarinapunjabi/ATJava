public class DemoApp {
    public static void main(String[] args) {

        BaseballCard c1 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard c2 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard c3 = new BaseballCard("Jeter", 2001);

        System.out.println(c1);
        System.out.println(c3);

       System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
