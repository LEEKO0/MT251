package Robot;

public class VariableSpeedRobot extends SpeedRobot {
    VariableSpeedRobot() {
    }

    void moveNorth(int speed) {
        super.setSpeed(speed);
        super.moveNorth();
    }

    void moveSouth(int speed) {
        super.setSpeed(speed);
        super.moveSouth();
    }

    void moveWest(int speed) {
        super.setSpeed(speed);
        super.moveWest();
    }

    void moveEast(int speed) {
        super.setSpeed(speed);
        super.moveEast();
    }
}
