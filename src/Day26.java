package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-nested-logic/problem

    Sample Input:
        9 6 2015
        6 6 2015

    Sample Output:
        45
*/
public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dates = new int[6];
        int i = 0;
        while(scanner.hasNextInt() && dates.length <= 6) {
            dates[i++] = scanner.nextInt();
        }
        System.out.println(calculateFine(dates));
    }

    public static int calculateFine(int[] dates) {
        int returnedDay = dates[0];
        int expectedDay = dates[3];
        int returnedMonth = dates[1];
        int expectedMonth = dates[4];
        int returnedYear = dates[2];
        int expectedYear = dates[5];

        int fine = 0;
        if(returnedYear == expectedYear) {
            // Same calendar year
            if(returnedMonth > expectedMonth) {
                fine = 500 * (returnedMonth - expectedMonth);
            } else if(returnedMonth == expectedMonth && returnedDay > expectedDay) {
                fine = 15 * (returnedDay - expectedDay);
            }
        } else if(returnedYear > expectedYear) {
            fine = 10000;
        }
        return fine;
    }
}
