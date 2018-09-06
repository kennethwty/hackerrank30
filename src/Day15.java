package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head parameter.
    Once the new node is added, return the reference to the head node.

    Input Format:
        The insert function has 2 parameters: a pointer to a Node named head, and an integer value, data.
        The constructor for Node has 1 parameter: an integer value for the data field.

    Output Format:
        Your insert function should return a reference to the head node of the linked list.

    Sample Input:
        4
        2
        3
        4
        1

    Sample Output:
        2 3 4 1
*/
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
    public static Node insert(Node head,int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            // At tail of the list
            temp.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
