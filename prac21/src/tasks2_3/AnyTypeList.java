package tasks2_3;

import java.util.ArrayList;

public class AnyTypeList {
    ArrayList<Object> array = new ArrayList<>();

    public void append(Object newObj) {
        array.add(newObj);
    }

    public void remove(Object obj) {
        array.remove(obj);
    }

    public void show() {
        System.out.println(array);
    }

    public int getObjectIndex(Object obj) {
        int i = 0;
        for (Object obj1: array) {
            if (obj.equals(obj1))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Object getObject(int index) {
        return array.get(index);
    }
}
