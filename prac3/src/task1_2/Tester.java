package task1_2;
import java.util.ArrayList;
public class Tester {
    ArrayList<Circle> circles = new ArrayList<>();
    int count = 0;

    public Tester() {

    }

    public void addCircle(Circle new_circle) {
        circles.add(new_circle);
        count++;
    }

    public void removeCircle(Circle remove_circle) {
        if (circles.contains(remove_circle))
        {
            circles.remove(remove_circle);
            count--;
        }
    }

    public Circle getCircleWithMaxRadius() {
        if (circles.isEmpty()) return null;
        Circle temp = circles.get(0);
        for (int i = 0; i < count; i++)
        {
            if (circles.get(i).getRadius() > temp.getRadius())
            {
                temp = circles.get(i);
            }
        }
        return temp;
    }

    public Circle getCircleWithMinRadius() {
        if (circles.isEmpty()) return null;
        Circle temp = circles.get(0);
        for (int i = 0; i < count; i++)
        {
            if (circles.get(i).getRadius() < temp.getRadius())
            {
                temp = circles.get(i);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        String toreturn =  "Tester{circles=[";
        for (int i = 0; i < count; i++)
        {
            toreturn += circles.get(i);
            toreturn += "\n";
        }
        toreturn += "], count=" + count + '}';

        return toreturn;
    }
}
