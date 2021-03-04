package MainClasses;

public class TV {
    int channel;
    int volumLevel;
    boolean on;

    TV() {
        this.setChannel(1);
        this.setVolumeLevel(1);
        this.turnOff();
    }

    public void turnOn() {
        this.on = true;
        System.out.println("TV is on");
    }

    public void turnOff() {
        this.on = false;
        System.out.println("TV is off");
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 127)
            this.channel = channel;
        else
            System.out.println("Channel not found");
    }

    public void setVolumeLevel(int volumLevel) {
        if (volumLevel >= 1 && volumLevel <= 7)
            this.volumLevel = volumLevel;
        else
            System.out.println(volumLevel > 7 ? "volume max" : "volume low");
    }
}
