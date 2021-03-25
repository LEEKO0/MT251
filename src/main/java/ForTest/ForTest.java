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
        String s = "A B C D E F  G H I J K  L M N O P  Q R S T U  V W X Y Z";
        String decryptMsg = decryptMessage("DPJ LKJAZQKL");
        String encryptMsg = encryptMessage("DPJ LKJAZQKL");

        System.out.println("MESSAGE: " + s);
        System.out.println("DECRYPT: " + decryptMsg);
        System.out.println("ENCRYPT: " + encryptMsg);
        System.out.println();
        System.out.println(decryptMessage(s));
    }

    public static String decryptMessage(String s) {
        String decryptMsg = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                decryptMsg += String.valueOf(decryptChar(s.charAt(i)));
            } else {
                decryptMsg += " ";
            }
        }
        return decryptMsg;
    }

    public static String encryptMessage(String s) {
        String decryptMsg = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                decryptMsg += String.valueOf(encryptChar(s.charAt(i)));
            } else {
                decryptMsg += " ";
            }
        }
        return decryptMsg;
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

    public static char[] decryptChar(Character c) {
        final int KEY = 3;
        final int ALPHABIT_INDEX = 26;
        int letter = c.charValue() + KEY;

        if (Character.toChars(letter)[0] >= 'Z') {
            return Character.toChars(letter - ALPHABIT_INDEX);
        } else if (Character.toChars(letter)[0] <= 'A') {
            System.out.println(letter + ALPHABIT_INDEX + KEY);
            return Character.toChars(letter + ALPHABIT_INDEX + KEY);
        }

        return Character.toChars(letter);
    }

    public static char[] encryptChar(Character c) {
        final int KEY = 3;
        final int ALPHABIT_INDEX = 26;
        int letter = KEY - c.charValue();
        System.out.println(letter);
        if (Character.toChars(letter)[0] >= 'Z') {
            return Character.toChars(letter - ALPHABIT_INDEX);
        } else if (Character.toChars(letter)[0] < 'A') {
            return Character.toChars(letter + ALPHABIT_INDEX - KEY);
        }

        return Character.toChars(letter);
    }
}

/// "C:\Users\saa11\Desktop\debug.log"