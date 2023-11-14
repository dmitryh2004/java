package task2;

public class Main {
    public static void main(String[] args) {
        ChairFactory cf = new ChairFactory(150);
        VictorianChair vc = cf.createVictorianChair();
        FunctionalChair fc = cf.createFunctionalChair();
        MagicChair mc = cf.createMagicChair();
        Client c = new Client();
        c.setChair(vc);
        c.sit();
        c.setChair(mc);
        c.sit();
        c.setChair(fc);
        c.sit();
    }
}
