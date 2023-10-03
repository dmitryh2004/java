package tasks1_2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkSpeeds()
    {
        return ((this.topLeft.xSpeed == this.bottomRight.xSpeed) &&
                (this.topLeft.ySpeed == this.bottomRight.ySpeed));
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if (!checkSpeeds()) {
            topLeft.xSpeed = bottomRight.xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!checkSpeeds()) {
            topLeft.xSpeed = bottomRight.xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!checkSpeeds()) {
            topLeft.xSpeed = bottomRight.xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!checkSpeeds()) {
            topLeft.xSpeed = bottomRight.xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
