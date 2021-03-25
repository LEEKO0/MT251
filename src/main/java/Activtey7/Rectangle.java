package Activtey7;

public class Rectangle extends Shape implements ColorFul, Comparable<Rectangle> {
    private int width;
    private String color;

    Rectangle() {
        this(0, 0, "white");
    }

    Rectangle(int width, int height, String color) {
        super(height);
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape is: Rectangle\t" + super.toString() + "\tWidth: " + this.getWidth() + "\tColor: "
                + this.getColor();
    }

    @Override
    public void makeItRed() {
        this.setColor("Red");
    }

    @Override
    public double calcArea() {
        return super.getHeight() * this.getWidth();
    }

    @Override
    public int compareTo(Rectangle o) {
        return (int) (this.calcArea() - o.calcArea());
    }
}
