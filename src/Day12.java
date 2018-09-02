package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
        Complete the Student class by writing the following:

            A Student class constructor, which has  parameters:
                1. A string, firstName.
                2. A string, lastName.
                3. An integer, id.
                4. An integer array (or vector) of test scores, scores.

            A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average.

    Input Format:
        The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments.
        It also calls the calculate method (which takes no arguments).
        You are not responsible for reading the following input from stdin:
        The first line contains firstName, lastName, and id, respectively.
        The second line contains the number of test scores. The third line of space-separated integers describes scores.

    Output Format:
        This is handled by the locked stub code in your editor.
        Your output will be correct if your Student class constructor and calculate() method are properly implemented.

    Sample Input:
        Heraldo Memelli 8135627
        2
        100 80

    Sample Output:
        Name: Memelli, Heraldo
        ID: 8135627
        Grade: O
 */
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int total = 0;
        double average;
        for(int i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }
        average = total / testScores.length;

        if(average < 40) return 'T';
        else if(average < 55) return 'D';
        else if(average < 70) return 'P';
        else if(average < 80) return 'A';
        else if(average < 90) return 'E';
        else return 'O';
    }
}

public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
