package Shpaes;

public class Reactangle extends GeometricObject {
    private double height;
    private double width;
    private static int numberOfObjs;

    Reactangle() {
        this(0, 0);
    }

    Reactangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
        numberOfObjs++;
    }

    Reactangle(double width) {
        this(width, width);
    }

    Reactangle(double width, double height, String color, boolean filled) {
        this(width, height);
        setColor(color);
        setFilled(filled);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static int getNumberOfObjs() {
        return numberOfObjs;
    }

    public boolean isItSquare() {
        return (this.height == this.width && (this.width != 0 || this.height != 0));
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Reactangle) {
            Reactangle objR = (Reactangle) o;
            if (super.equals(o))
                return this.getHeight() == objR.getHeight() && this.getWidth() == objR.getWidth();
        }
        return false;
    }

    @Override
    public String toString() {

        return super.toString() + "\nWidth: " + this.getWidth() + "\nHeight: " + this.getHeight();
    }
}
