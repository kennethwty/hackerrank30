package src;

import java.util.LinkedList;
import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-binary-trees/problem

    Sample Input:
        6
        3
        5
        4
        7
        2
        1

    Sample Output:
        3 2 5 1 4 7
*/
class TNode{
    TNode left,right;
    int data;
    TNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {
    static void levelOrder(TNode root){
        if(root == null) return;
        LinkedList<TNode> queue = new LinkedList<>();
        queue.addFirst(root);
        while(queue.size() > 0) {
            TNode parentNode = queue.removeLast();
            System.out.print(parentNode.data + " ");
            if(parentNode.left != null) queue.addFirst(parentNode.left);
            if(parentNode.right != null) queue.addFirst(parentNode.right);
        }
    }

    public static TNode insert(TNode root,int data){
        if(root==null){
            return new TNode(data);
        }
        else{
            TNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
