package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.

    Sample Input 0:
        3

    Sample Output 0:
        3

    Sample Input 1:
        za

    Sample Output 1:
        Bad String
*/
public class Day16 {
    public static void main(String[] args) {
        // updated to use try-with-resources instead so that the Scanner will be closed automatically after try/catch block
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int input = Integer.parseInt(S);
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
