package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

    Input Format:
        There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.

    Output Format:
        Print the largest (maximum) hourglass sum found in A.

    Sample Input:
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0

    Sample Output:
        19

    Explanation:

        A contains the following hourglasses:

        1 1 1   1 1 0   1 0 0   0 0 0
          1       0       0       0
        1 1 1   1 1 0   1 0 0   0 0 0

        0 1 0   1 0 0   0 0 0   0 0 0
          1       1       0       0
        0 0 2   0 2 4   2 4 4   4 4 0

        1 1 1   1 1 0   1 0 0   0 0 0
          0       2       4       4
        0 0 0   0 0 2   0 2 0   2 0 0

        0 0 2   0 2 4   2 4 4   4 4 0
          0       0       2       0
        0 0 1   0 1 2   1 2 4   2 4 0

        The hourglass with the maximum sum () is:

        2 4 4
          2
        1 2 4
*/
public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        // set up the 2D array from inputs
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int currentTotal = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(currentTotal > max) {
                    max = currentTotal;
                }
            }
        }

        System.out.println(max);

    }
}
