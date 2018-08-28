package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:

    1. Declare 3 variables: one of type int, one of type double, and one of type String.
    2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
    3. Use the + operator to perform the following operations:
        3.1 Print the sum of i plus your int variable on a new line.
        3.2 Print the sum of d plus your double variable to a scale of one decimal place on a new line.
        3.3 Concatenate s with the string you read as input and print the result on a new line.

    Input Format:
        The first line contains an integer that you must sum with i.
        The second line contains a double that you must sum with d.
        The third line contains a string that you must concatenate with s.

    Output Format: Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place) on the second line, and then the two concatenated strings on the third line.

    Sample Input:
        12
        4.0
        is a good place to learn and practice coding!

    Sample Output:
        16
        8.0
        HackerRank is a good place to learn and practice coding!
*/
public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int intVal;
        double doubleVal;
        String stringVal;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        intVal = scan.nextInt();
        doubleVal = scan.nextDouble();
        scan.nextLine(); // consume the new line
        stringVal = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + intVal);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubleVal);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringVal);

        scan.close();
    }
}
