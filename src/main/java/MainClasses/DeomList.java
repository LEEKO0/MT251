package MainClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeomList {
    private ArrayList<Integer> list;

    DeomList() {
        list = new ArrayList<Integer>();
    }

    public void fill() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number != 0)
                list.add(number);
            else
                System.out.println("Thank you.");
        } while (number != 0);

        input.close();
    }

    public void sortList() {
        Collections.sort(list);
    }

    public void brint() {

        System.out.println("Array :" + list.toString());
    }

    public int maximum() {
        return Collections.max(list);
    }

    public double avarage() {
        double total = 0;
        for (int i : list)
            total += i;
        return total / this.list.size();
    }

    public double median() {

        if (this.list.size() % 2 == 0) {
            int element1 = this.list.size() / 2;
            int element2 = ((this.list.size() - 1) / 2);

            return (this.list.get(element1) + this.list.get(element2) / 2.0);
        }
        return this.list.get((this.list.size() - 1) / 2);
    }
}
