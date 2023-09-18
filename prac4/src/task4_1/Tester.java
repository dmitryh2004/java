package task4_1;

public class Tester {
    public static void main(String[] args) {
        SeasonsClass sc = new SeasonsClass(0);
        sc.iLoveSeason();
        for (Seasons s : Seasons.values())
        {
            System.out.println(s);
        }
    }
}
