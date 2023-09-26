package task8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(6.66);
        Circle ci = new Circle(3.14);
        Rectangle rec = new Rectangle(2.71, 1.616);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(sq);
        shapes.add(ci);
        shapes.add(rec);
        for (Shape sh: shapes)
        {
            System.out.println(sh);
            System.out.println("Площадь фигуры: " + sh.getArea());
            System.out.println("Периметр фигуры: " + sh.getPerimeter());
        }
    }
}
