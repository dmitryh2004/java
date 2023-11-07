package task2;

import abstractQueue.mAbstractQueue;

import java.util.LinkedList;

public class LinkedQueue<T> extends mAbstractQueue<T> {
    LinkedList<T> slots;
    int size;

    public LinkedQueue(int size) {
        this.size = size;
        slots = new LinkedList<>();
    }

    public void enqueue(T el) {
        if (slots.size() == size)
            System.out.println("Error (enqueue): Queue is full");
        else
        {
            slots.addLast(el);
        }
    }

    public T dequeue() {
        if (slots.size() == 0)
        {
            System.out.println("Error (dequeue): Queue is empty");
            return null;
        }
        else
        {
            return slots.pollFirst();
        }
    }

    public T getFirst() {
        return slots.getFirst();
    }

    public boolean isEmpty() {
        return (slots.size() == 0);
    }

    public void clear() {
        for (int i = 0; i < size; i++)
        {
            slots.pollLast();
        }
    }

    public void show() {
        System.out.println("Queue:");
        if (slots.size() == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < slots.size(); i++)
        {
            StringBuilder label = new StringBuilder();
            label.append("Position ").append(i);
            label.append(": ");
            T data = slots.get(i);
            label.append(data.toString());
            System.out.println(label.toString());
        }
    }
}

