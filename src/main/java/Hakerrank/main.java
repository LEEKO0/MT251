package Hakerrank;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        isSymmetric();
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static void isSymmetric() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = input.nextInt();
        if (!(rows >= 1 && rows <= 1000))
            isSymmetric();

        System.out.println("Enter number of Columns: ");
        int columns = input.nextInt();
        if (!(columns >= 1 && columns <= 1000))
            isSymmetric();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = input.nextInt();
        int check = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    check = -1;
                    break;
                }

            }
        if (check == -1)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
