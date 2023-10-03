package tasks1_2;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(6, 3, 4, 5, 3);
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        
        MovableRectangle rect = new MovableRectangle(-3, -4, 3, 4, 9, 4);
        System.out.println(rect);
        rect.moveUp();
        System.out.println(rect);
        rect.moveDown();
        System.out.println(rect);
        rect.moveLeft();
        System.out.println(rect);
        rect.moveRight();
        System.out.println(rect);
    }
}
