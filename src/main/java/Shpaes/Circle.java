package Shpaes;

public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radiuse;

    Circle() {
        this(0);
    }

    Circle(double radiuse) {
        super();
        this.setRadius(radiuse);

    }

    Circle(double radiuse, String color, boolean filled) {
        this(radiuse);
        System.out.println("circle create");
        // super.setColor(color);
        // super.setFilled(filled);
    }

    public double getRadius() {
        return this.radiuse;
    }

    public void setRadius(double radiuse) {
        this.radiuse = radiuse;
    }

    public double getDiammiter() {
        return 2 * this.radiuse;
    }

    public void printCircle() {
        this.toString();
    }

    @Override
    public int compareTo(Circle o) {

        return (int) (this.getRadius() - o.getRadius());
    }

    @Override
    public double getArea() {
        return Math.pow(this.radiuse, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radiuse;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            if (super.equals(o))
                return this.getRadius() == ((Circle) o).getRadius();
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "radius: " + this.getRadius();
    }

}
