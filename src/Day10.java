package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Given a base-10 integer, n, convert it to binary (base-2).
        Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

        Sample Input 1
            5

        Sample Output 1
            1

        Sample Input 2
            13

        Sample Output 2
            2

        Explanation:
            Sample Case 1: The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.
            Sample Case 2: The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
*/
public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] bitGroups = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String str : bitGroups){
            if(max < str.length()){
                max = str.length();
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
