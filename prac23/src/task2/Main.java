package task2;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> queueADT = new LinkedQueue<>(5);
        queueADT.show();
        queueADT.dequeue();
        queueADT.enqueue(123);
        queueADT.show();
        queueADT.enqueue(1234);
        queueADT.enqueue(12345);
        queueADT.enqueue(123456);
        queueADT.enqueue(1234567);
        queueADT.enqueue(1);
        queueADT.show();
        queueADT.dequeue();
        queueADT.show();
        queueADT.clear();
        queueADT.show();
    }
}
