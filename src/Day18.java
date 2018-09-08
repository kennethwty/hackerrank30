package src;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
    By: Tszyan "Kenneth" Wong

    Task: Test whether a string is a palindrome by using a stack and a queue.

    Sample Input:
        racecar

    Sample Output:
        The word, racecar, is a palindrome.
*/
public class Day18 {
    private Stack<Character> stack;
    private LinkedList<Character> queue;

    public Day18() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char c) {
        stack.push(c);
    }

    public void enqueueCharacter(char c) {
        queue.addFirst(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.removeLast();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}