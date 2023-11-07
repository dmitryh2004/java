package tasks2_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AnyTypeList atl = new AnyTypeList();
        atl.append(123);
        atl.append(123.45);
        atl.append("123.45.6789abcd");
        atl.append(new ArrayList<Integer>());
        ArrayList<Integer> ali = (ArrayList<Integer>)atl.getObject(3);
        ali.add(123);
        ali.add(124);
        atl.show();
        System.out.println("Элемент массива с индексом 2: " + atl.getObject(2).toString());
    }
}
