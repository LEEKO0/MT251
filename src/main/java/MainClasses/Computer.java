package MainClasses;

public class Computer {
    private String brandName;
    private boolean isOn;

    Computer() {
        this(null, false);
    }

    Computer(String brandName, boolean isOn) {
        this.setBrandName(brandName);
        this.setIsOn(isOn);
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void switchOn() {
        System.out.println("The computer is on");
        this.setIsOn(true);
    }

    public void switchOff() {
        System.out.println("The computer is off");
        this.setIsOn(false);
    }

    public void display() {
        System.out.println("brand name: " + this.getBrandName());
        System.out.println("is on?: " + this.getIsOn());
        System.out.println();
    }

}
