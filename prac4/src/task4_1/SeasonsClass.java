package task4_1;

public class SeasonsClass {
    Seasons season;

    public void iLoveSeason()
    {
        switch (season)
        {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
    public SeasonsClass(int code)
    {
        switch (code) {
            case 0 -> season = Seasons.WINTER;
            case 1 -> season = Seasons.SPRING;
            case 2 -> season = Seasons.SUMMER;
            case 3 -> season = Seasons.AUTUMN;
        }
    }
}
