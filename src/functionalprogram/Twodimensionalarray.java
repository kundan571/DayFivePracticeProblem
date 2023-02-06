package functionalprogram;

import java.util.Scanner;

public class Twodimensionalarray {
    public static void main(String[] args) {
        System.out.println("Enter 2D array size : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter array elements : ");
        // Declaration of Two Dimenional array
        int twodimensional [][] = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twodimensional[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Print entered Element : ");
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(twodimensional[i][j] + "\t");
            }
        }

    }
}
