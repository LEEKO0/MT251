package MainClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class First {
    public static Scanner input = new Scanner(System.in);
    Integer[] j = { 1, 2, 3, 4 };

    public static void main(String[] args) {
        System.out.println(-11 % 3);
        "ABC".compareTo("BDA");

        try {
            File filePath = new File("C:\\Users\\saa11\\Desktop\\x.txt");
            PrintWriter write = new PrintWriter(filePath);
            write.println("Study well for the final exam");
            write.println("It will be an easy exam");
            write.println("Just study well and concentrate during the exam");
            write.println("Good Luck");

            write.close();

            Scanner read = new Scanner(filePath);

            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // DeomList deomList = new DeomList();
        // System.out.println(deomList);
        // deomList.fill();
        // deomList.brint();
        // deomList.sortList();
        // deomList.brint();

        // System.out.println();
        // char ch = 10;
        // System.out.println(ch);
        // System.out.println("Max number is :" + deomList.maximum());
        // System.out.println("Avarage :" + deomList.avarage());
        // System.out.println("median :" + deomList.median());
        // System.out.println("median :" + deomList.median());

        // byte[] b = new byte[4];

    }

}
// -------------------------------------------------
// VatCa Class
// -------------------------------------------------
// final int PERCENT = 100;
// float tax = 0f;
// float amount = 0f;

// System.out.print("\nSelect 1 or 2: ");
// switch (input.nextLine()) {
// case "1":
// System.out.print("\nPlease enter your amount: ");
// amount = input.nextFloat();

// System.out.print("Enter your Tax amount: %");
// tax = input.nextFloat() / PERCENT;

// System.out.println("\nYour amount is: " + amount);
// System.out.printf("Vat: %.1f %n", (amount * tax));
// System.out.println("Total: " + (amount + (amount * tax)) + "\n");
// break;
// case "2":
// System.out.print("\nPlease enter your amount: ");
// amount = input.nextFloat();

// System.out.print("Enter your Tax amount: %");
// tax = 1 + input.nextFloat() / PERCENT;

// System.out.println("\nYour total amount is: " + amount);
// System.out.printf("Vat: %.1f %n", (amount - (amount / tax)));
// System.out.printf("Amount without Vat: %.1f %n%n", (amount / tax));
// break;

// }

// -------------------------------------------------
// Computer Class
// -------------------------------------------------

// Computer comp1 = new Computer("Acer", false);
// Computer comp2 = new Computer();
// Computer[] computers = new Computer[5];

// comp2.setBrandName("Dell");
// comp2.setIsOn(true);

// System.out.println();
// comp1.display();
// comp2.display();

// comp1.switchOn();
// comp2.switchOff();
// System.out.println();

// comp1.display();
// comp2.display();

// System.out.println();

// for (int i = 0; i < computers.length; i++) {

// computers[i] = new Computer();
// System.out.print("Enter brand name: ");
// computers[i].setBrandName(input.nextLine());

// System.out.print("press on / off : ");
// if (input.nextLine().equals("on"))
// computers[i].setIsOn(true);
// else
// computers[i].setIsOn(false);

// System.out.println();
// }

// System.out.println("\n--------------------------- ");
// System.out.println("Your device is ");
// System.out.println("-----------------------------\n");

// for (int i = 0; i < computers.length; i++)
// computers[i].display();

//////////////////////////////////////////////////////////

// -------------------------------------------------
// MyQueue Class
// -------------------------------------------------

// MyQueue queue = new MyQueue();

// queue.enqueue(5);
// queue.enqueue(10);
// queue.enqueue(22);
// queue.enqueue(53);

// System.out.println(queue.first());
// System.out.println(queue.dequeue());
// System.out.println(queue.first());
// System.out.println(queue.len());

// System.out.println(queue.toString());