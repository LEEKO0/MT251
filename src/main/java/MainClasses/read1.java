package MainClasses;

import java.io.*;
import java.util.*;

public class read1 {
    public static void main(String[] args) {

        try {
            File fi = new File("C:\\Users\\Meshaal\\Desktop\\luck.txt");
            PrintWriter pr = new PrintWriter(fi);
            Scanner sc = new Scanner(fi);
            pr.println("study well");
            pr.close();
            for (int i = 1; i <= 4; i++) {

                System.out.println(i + " " + sc.nextLine());

            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}