package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

    Input Format:
        There are 3 lines of numeric input:
        The first line has a double, mealCost (the cost of the meal before tax and tip).
        The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
        The third line has an integer, taxPercent (the percentage of mealCost being added as tax).

    Output Format:
        Print The total meal cost is totalCost dollars., where totalCost is the rounded integer result of the entire bill (mealCost with added tax and tip).

    Sample Input:
        12.00
        20
        8

    Sample Output:
        The total meal cost is 15 dollars.
*/
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * (tipPercent/100.0);
        double tax = mealCost * (taxPercent/100.0);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
