package task1;

public class ArrayQueueModule<T> {
    T data;
    ArrayQueueModule<T> prev;

    public ArrayQueueModule(T data) {
        this.data = data;
        this.prev = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayQueueModule<T> getPrev() {
        return prev;
    }

    public void setPrev(ArrayQueueModule<T> prev) {
        this.prev = prev;
    }

    public void show()
    {
        System.out.println(this.data);
    }
}
