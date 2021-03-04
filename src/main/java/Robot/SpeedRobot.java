package Robot;

public class SpeedRobot extends Robot {
    private int speed;

    SpeedRobot() {
        this(0);
    }

    SpeedRobot(int speed) {
        this.speed = speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    @Override
    void moveNorth() {
        super.setY(super.getY() + this.getSpeed());
    }

    @Override
    void moveSouth() {
        super.setY(super.getY() - this.getSpeed());
    }

    @Override
    void moveWest() {
        super.setX(super.getX() + this.getSpeed());
    }

    @Override
    void moveEast() {
        super.setX(super.getX() - this.getSpeed());
    }

    @Override
    public String toString() {
        return super.toString() + ", and its speed is " + this.getSpeed();
    }
}
