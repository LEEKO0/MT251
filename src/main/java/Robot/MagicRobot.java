package Robot;

public class MagicRobot extends Robot {
    private boolean visible;

    MagicRobot() {
        this.visible = false;
    }

    void makeVisible() {
        this.visible = true;
    }

    void makeInVisible() {
        this.visible = false;
    }

    public boolean isVisble() {
        return this.visible;
    }

    @Override
    public String toString() {
        if (this.isVisble())
            return super.toString() + "\t" + "and it is visible";
        return super.toString() + "\t" + "and it is invisible";
    }
}
