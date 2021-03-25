package Robot;

public class TestRobot {

    public static void main(String[] arrgs) {
        Robot tetoo = new Robot(5, 2);
        Robot detoo = new Robot();

        tetoo.getX();
        detoo.getX();

        detoo.setX(3);
        detoo.setY(10);

        System.out.println(tetoo.toString());
        System.out.println(detoo.toString());

        tetoo.moveEast();
        tetoo.moveEast();
        tetoo.moveEast();

        detoo.moveSouth();
        detoo.moveSouth();

        System.out.println(tetoo.toString());
        System.out.println(detoo.toString());

        System.out.println();

        MagicRobot medoo = new MagicRobot();
        System.out.println(medoo.toString());

        medoo.setX(3);
        medoo.setY(5);

        System.out.println(medoo.toString());
        medoo.makeVisible();

        System.out.println(medoo.toString());

        System.out.println();

        SpeedRobot speedoo = new SpeedRobot(5);
        System.out.println(speedoo.toString());

        speedoo.moveNorth();
        speedoo.moveNorth();

        speedoo.moveWest();
        speedoo.moveWest();

        speedoo.setSpeed(10);
        System.out.println(speedoo.toString());
        System.out.println();

        VariableSpeedRobot vspeedoo = new VariableSpeedRobot();
        System.out.println(vspeedoo.toString());

        vspeedoo.moveNorth();
        vspeedoo.moveEast();
        System.out.println(vspeedoo.toString());

        vspeedoo.setSpeed(2);
        vspeedoo.moveNorth();
        vspeedoo.moveEast();
        System.out.println(vspeedoo.toString());

        vspeedoo.moveNorth(10);
        vspeedoo.moveEast(10);
        System.out.println(vspeedoo.toString());

    }
}
