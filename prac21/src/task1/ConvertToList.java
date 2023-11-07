package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToList {
    public static <T> List<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
