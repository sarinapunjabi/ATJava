public class BaseballCard {
    String name;
    int year;

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

   public String toString() {
        return name + " " + year;
   }

    public boolean equals(Object obj) {
        BaseballCard other = (BaseballCard) obj;

        if(name.equals(other.name) && year == other.year) {
            return true;
        }

        return false;
    }
}
