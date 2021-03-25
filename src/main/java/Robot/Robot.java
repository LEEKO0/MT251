package Robot;

public class Robot {

    private int x;
    private int y;

    Robot() {
        this.x = 0;
        this.y = 0;
    }

    Robot(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    void moveNorth() {
        this.y++;
    }

    void moveSouth() {
        this.y--;
    }

    void moveEast() {
        this.x++;
    }

    void moveWest() {
        this.x--;
    }

    void moveTo(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "X: " + this.getX() + ",\t" + "Y: " + this.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Robot) {
            Robot robot = (Robot) o;
            if (robot.getX() == this.x && robot.getY() == this.y)
                return true;
        }
        return false;
    }

}
