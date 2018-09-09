package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-sorting/problem

    Sample Input 0:
        3
        1 2 3

    Sample Output 0:
        Array is sorted in 0 swaps.
        First Element: 1
        Last Element: 3

    Sample Input 1:
        3
        3 2 1

    Sample Output 1:
        Array is sorted in 3 swaps.
        First Element: 1
        Last Element: 3
*/
public class Day20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }

    public static void bubbleSort(int[] arr) {
        int numOfSwaps = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    numOfSwaps++;
                }
            }
            if(numOfSwaps == 0) break;
        }

        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
