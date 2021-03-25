package Activtey7;

public class TestShape {
    public static void main(String[] arr) {

        Rectangle r1 = new Rectangle(4, 5, "green");
        Rectangle r2 = new Rectangle(5, 6, "gray");

        System.out.println(r1.calcArea());
        System.out.println(r2.calcArea());

        r1.makeItRed();
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println(r1.compareTo(r2));
    }

}
