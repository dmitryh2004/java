package task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println("Ball 1: " + ball1);
        ball1.move(4,3);
        System.out.println("Ball 1: " + ball1);
        Ball ball2 = new Ball(4, 5);
        System.out.println("Ball 2: " + ball2);
        ball2.move(-4,3);
        ball2.move(4.5,-34);
        System.out.println("Ball 2: " + ball2);
    }
}
