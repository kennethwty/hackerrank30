package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-bitwise-and/problem

    Sample Input:
        3
        5 2
        8 5
        2 2

    Sample Output:
        1
        4
        0
*/
public class Day29 {
    public static void maximum(int n, int k) {
        int currentMax = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] & arr[j];
                currentMax = (temp > currentMax && temp < k) ? temp : currentMax;
            }
        }

        System.out.println(currentMax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            maximum(n, k);
        }

        scanner.close();
    }
}
