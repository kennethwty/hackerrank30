package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Given an integer, n, perform the following conditional actions:
        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird

    Sample Input:
        3

    Sample Output:
        Weird

    Sample Input:
        24

    Sample Output:
        Not Weird
*/
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n % 2 == 1){
            ans = "Weird";
        }
        else{
            // Complete the code
            if(n >= 2 && n <= 5){
                ans = "Not Weird";
            }
            else if(n >= 6 && n <= 20){
                ans = "Weird";
            }
            else{
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
