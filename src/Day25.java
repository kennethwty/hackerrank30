package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

    Sample Input:
        3
        12
        5
        7

    Sample Output:
        Not prime
        Prime
        Prime
*/
public class Day25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInput = scanner.nextInt();

        while(numOfInput > 0) {
            isPrime(scanner.nextInt());
            numOfInput--;
        }
    }

    public static void isPrime(int input) {
        if(input <= 1) {
            System.out.println("Not prime");
            return;
        } else if(input == 2) {
            System.out.println("Prime");
            return;
        } else if((input & 1) == 0) {
            // Even numbers greater than 2
            System.out.println("Not prime");
        } else {
            // Odd numbers greater than 2
            for(int i = 3; i <= Math.sqrt(input); i+=2) {
                if (input % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}
