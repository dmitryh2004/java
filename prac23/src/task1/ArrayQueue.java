package task1;

import abstractQueue.mAbstractQueue;

import java.util.ArrayList;

public class ArrayQueue<T> extends mAbstractQueue<T> {
    ArrayList<ArrayQueueModule<T>> slots;
    int size;
    int front = 0;
    int rear = 0;
    int length = 0;

    public ArrayQueue(int size) {
        this.size = size;
        slots = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
        {
            ArrayQueueModule<T> temp = new ArrayQueueModule<>(null);
            slots.add(temp);
            if (i >= 1)
                temp.setPrev(slots.get(i));

        }
        slots.get(0).setPrev(slots.get(size-1));
    }

    public void enqueue(T el) {
        if ((rear == front) && (slots.get(0).getData() != null))
            System.out.println("Queue is full");
        else
        {
            slots.get(rear).setData(el);
            rear++;
            length++;
            if (rear == size) rear -= size;
        }
    }

    public T dequeue() {
        if ((rear == front) && (slots.get(0).getData() == null))
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            T output = slots.get(front).getData();
            slots.get(front).setData(null);
            front++;
            length--;
            if (front == size) front -= size;
            return output;
        }
    }

    public int getLength() {
        return length;
    }

    public T getFirst() {
        return slots.get(front).getData();
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public void clear() {
        for (int i = 0; i < size; i++)
        {
            slots.get(i).setData(null);
        }
        length = 0;
        front = rear = 0;
    }

    public void show() {
        for (int i = 0; i < size; i++)
        {
            StringBuilder label = new StringBuilder();
            label.append("Position ").append(i);
            if (front == i)
                label.append(" (front)");
            if (rear == i)
                label.append(" (rear)");
            label.append(": ");
            T data = slots.get(i).getData();
            if (data != null)
                label.append(data.toString());
            else
                label.append("no data");
            System.out.println(label.toString());
        }
    }
}
