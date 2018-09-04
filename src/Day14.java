package src;

import java.util.Arrays;
import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Complete the Difference class by writing the following:
            1. A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
            2. A computeDifference method that finds the maximum absolute difference between any 2 numbers in Numbers and stores it in the maximumDifference instance variable.

    Sample Input:
        3
        1 2 5

    Sample Output:
        4

    Explanation:
        The scope of the elements array and maximumDifference integer is the entire class instance.

        The class constructor saves the argument passed to the constructor as the elements instance variable (where the computeDifference method can access it).

        To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any 2 elements:

        |1-2| = 1
        |1-5| = 4
        |2-5| = 3

        The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable.

        The locked stub code in the editor then prints the value stored as maximumDifference, which is 4.
*/
class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
        return maximumDifference;
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
