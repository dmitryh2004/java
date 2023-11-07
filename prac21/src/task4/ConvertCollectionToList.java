package task4;

import tasks2_3.AnyTypeList;

import java.util.Collection;

public class ConvertCollectionToList {
    public static <T> void showFirst5 (Collection<T> catalog) {
        AnyTypeList atl = new AnyTypeList();
        for (T item: catalog)
            atl.append(item);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(atl.getObject(i).toString());
        }
    }
}
