package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

    Sample Input:
        6
        1
        2
        2
        3
        3
        4

    Sample Output:
        1 2 3 4
*/
class LLNode{
    int data;
    LLNode next;
    LLNode(int d){
        data=d;
        next=null;
    }

}

public class Day24 {
    public static LLNode removeDuplicates(LLNode head) {
        if(head == null || head.next == null) return head;

        LLNode temp = head;
        while(temp.next != null) {
            if(temp.next.data == temp.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static LLNode insert(LLNode head,int data)
    {
        LLNode p=new LLNode(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            LLNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(LLNode head)
    {
        LLNode start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LLNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
