package week1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}