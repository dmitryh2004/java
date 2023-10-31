package tasks1_2;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> test1 =
                new GenericClass<>(123, "string 123", 123.45);
        System.out.println(test1.getTVar());
        System.out.println(test1.getVVar());
        System.out.println(test1.getKVar());
        test1.showTypes();
        GenericClass<Double, Integer, Integer> test2 =
                new GenericClass<>(123.45, 123, 45);
        System.out.println(test2.getTVar());
        System.out.println(test2.getVVar());
        System.out.println(test2.getKVar());
        test2.showTypes();
    }
}
