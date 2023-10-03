package task3;

public class Main {
    public static void main(String[] args) {
        Planet Earth = new Planet("Земля", (float) (6*Math.pow(10, 24)), 6400000);
        Star Sun = new Star("Солнце", (float) (1.98892 * Math.pow(10, 30)), 695500, 6000);
        System.out.println(Earth.getName());
        System.out.println(Sun.getName());
    }
}
