package task2_1;

public class Main {
    public static void main(String[] args) {
        double d1 = 0.15d, d2 = -75410.32d;
        Double D1 = Double.valueOf(d1);
        Double D2 = Double.valueOf(d2);
        Double D3 = Double.parseDouble("12345.6");
        int D2_i = D2.intValue();
        short D2_sh = D2.shortValue();
        byte D2_by = D2.byteValue();
        long D2_l = D2.longValue();
        float D2_f = D2.floatValue();
        System.out.println(D1);
        System.out.println(D2_i + " " + D2_sh + " " + D2_by + " " + D2_l + " " + D2_f);
        String d = Double.toString(3.14159);
        System.out.println(d);
    }
}