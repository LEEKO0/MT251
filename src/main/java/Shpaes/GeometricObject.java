package Shpaes;

import java.util.*;

public abstract class GeometricObject extends Object {

    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("white", false);
    }

    protected GeometricObject(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        dateCreated = new Date();
        System.out.println("GeomtreicObject conts");
    }

    public String getColor() {
        return this.color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public static Date date() {
        return new Date();
    }

    @Override
    public boolean equals(Object o) {
        GeometricObject gObject = (GeometricObject) o;
        return this.filled == gObject.isFilled() && this.color == gObject.getColor();
    }

    @Override
    public String toString() {

        return "Color: " + this.getColor() + "\n" + "Filled: " + this.isFilled() + "\n" + "Created Date: "
                + this.getDateCreated();
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
