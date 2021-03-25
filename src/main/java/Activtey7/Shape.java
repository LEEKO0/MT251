package Activtey7;

public abstract class Shape {
    private int height;

    Shape() {
        this(0);
    }

    Shape(int height) {
        this.height = height;
    }

    int getHeight() {
        return this.height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Height = " + this.getHeight();
    }
}
