package Shpaes;

public class Device {
    private double cost;
    public boolean strated;

    Device(double cost, boolean strated) {
        this.cost = cost;
        this.strated = strated;
    }

    Device(boolean strated) {
        this(200, strated);
    }

    void start() {
        this.strated = true;
        System.out.println("Start up device");
    }

    void shutDown() {
        this.strated = false;
        System.out.println("Shut Down device");
    }

    public String toString() {
        return "The cost is: " + this.cost;
    }
}
