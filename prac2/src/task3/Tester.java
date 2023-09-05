package task3;

public class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(1,2,5, "circle 1");
        circles[1] = new Circle(3,2,6, "circle 2");
        circles[2] = new Circle(4,-4,1, "circle 3");
        circles[3] = new Circle(1.353,2.323,2.67, "circle 4");
        circles[4] = new Circle(0,0,4, "circle -1");
        for (int i = 0 ; i < 5; i++)
        {
            System.out.println(circles[i]);
        }
        circles[0].setCenter(0,-1);
        System.out.println(circles[0]);
    }
}
