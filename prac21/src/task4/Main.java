package task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> catalog = new ArrayList<>();
        catalog.add(666);
        catalog.add(123.45);
        catalog.add("123 2");
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(123);
        ali.add(-123);
        ali.add(12345);
        catalog.add(ali);
        ArrayList<String> als = new ArrayList<>();
        als.add("12314");
        als.add("0123131");
        catalog.add(als);
        catalog.add(12341);
        catalog.add("gg");
        ConvertCollectionToList.showFirst5(catalog);
    }
}
