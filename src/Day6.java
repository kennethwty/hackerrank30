package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Given a string, S, of length N that is indexed from 0 to N-1,
    print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.

    Sample Input:
        2
        Hacker
        Rank

    Sample Output:
        Hce akr
        Rn ak
*/
public class Day6 {
    public static void main(String[] args) {
        String str;
        int numOfInput;

        Scanner in = new Scanner(System.in);
        numOfInput = in.nextInt();
        in.nextLine(); // consume the newline

        for(int i = 0; i < numOfInput; i++) {
            str = in.nextLine();
            for(int p1 = 0; p1 < str.length(); p1+=2) {
                System.out.print(str.charAt(p1));
            }
            System.out.print(" ");
            for(int p2 = 1; p2 < str.length(); p2+=2) {
                System.out.print(str.charAt(p2));
            }
            System.out.println();
        }
    }
}
