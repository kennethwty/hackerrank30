package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).

    Sample Input:
        3

    Sample Output:
        6
*/
public class Day9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
}
