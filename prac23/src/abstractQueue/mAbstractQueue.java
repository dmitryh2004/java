package abstractQueue;

public abstract class mAbstractQueue<T> {
    public abstract void enqueue(T el);
    public abstract T dequeue();
    public abstract T getFirst();
    public abstract void clear();
    public abstract boolean isEmpty();
    public abstract void show();
}
