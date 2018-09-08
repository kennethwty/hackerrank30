package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface.
        The implementation for the divisorSum(n) method must return the sum of all divisors of n.

    Sample Input:
        6

    Sample Output:
        I implemented: AdvancedArithmetic
        12
*/
interface AdvancedArithmetic{
    int divisorSum(int n);
}

class aCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = n; i > 0; i--) {
            if(n % i == 0) sum = sum + i;
        }
        return sum;
    }
}

public class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new aCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
