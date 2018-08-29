package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

    Sample Input:
        4
        1 4 3 2

    Sample Output:
        2 3 4 1
*/
public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n]; //create an array holding the N elements.

        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        //Call a method to reverse the array and print it out
        reverse_print(arr);
    }

    public static void reverse_print(int[] intArr) {
        for(int i = intArr.length-1; i>=0; i--) {
            System.out.print(intArr[i] + " ");
        }
    }
}
