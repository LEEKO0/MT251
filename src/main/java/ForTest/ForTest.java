package ForTest;

public class ForTest {

    public static void main(String[] arrgs) {
        // int pirmeNumber = 0;
        // for (int i = 1; i < 200; i++) {
        // pirmeNumber = (i * i) + i + 41;
        // if (searchForPrime(pirmeNumber)) {
        // System.out.println(i + " prime " + searchForPrime(pirmeNumber));
        // System.out.println();
        // }
        // }

        // -|x|≤x≤|x|

        // for (int i = -1000; i < 0; i++) {
        // System.out.println("x: " + (i + 0.5) + "\t" + (-Math.abs(-i + 0.5) <= i + 0.5
        // && i <= Math.abs(i + 0.5)));
        // }

        System.out.println(cellAndFloor(-3.4));
    }

    public static boolean cellAndFloor(double num) {
        int floor = -(int) Math.floor(-num);
        int ceil = (int) Math.ceil(num);
        System.out.println("floor: " + floor + "\t" + "ceil: " + ceil);
        return floor == ceil;
    }

    public static boolean searchForPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }

}
