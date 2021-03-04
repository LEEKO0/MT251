package Shpaes;

public class Main {
    public static void main(String[] arg) {

        // Circle circle = new Circle(5);
        // GeometricObject bObject = new Circle();
        // GeometricObject bObject2 = new Reactangle();
        // Device device = new Device(true);
        // Circle circle2 = new Circle(5);
        // int[] o = new int[5];
        // System.out.println(circle.equals(circle2));
        Circle circle = new Circle(2);
        Circle circle2 = new Circle(5);
        System.out.println(circle.compareTo(circle2));
        System.out.println(new Circle(2).compareTo(new Circle(5)));
        System.out.println(10.0 / 2);
        // System.out.println("A circle\n" + circle.toString());
        // System.out.println("The color is " + circle.getColor());
        // System.out.println("The radius " + circle.getRadius());
        // System.out.println("The area is " + circle.getArea());
        // System.out.println("The diameter " + circle.getDiammiter());

        // Reactangle reactangle = new Reactangle(9, 6, "Green", true);
        // System.out.println("\nA rectangle\n" + reactangle.toString());
        // System.out.println("The area is " + reactangle.getArea());
        // System.out.println("The perimeter is " + reactangle.getPerimeter());
    }
}
