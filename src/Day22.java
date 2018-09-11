package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Link to the problem: https://www.hackerrank.com/challenges/30-binary-search-trees/problem

    Sample Input:
        7
        3
        5
        2
        1
        4
        6
        7

    Sample Output:
        3
*/
class TreeNode{
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22 {
    public static int getHeight(TreeNode root){
        if(root == null) return -1;

        int leftHeight;
        int rightHeight;

        leftHeight = getHeight(root.left) + 1;
        rightHeight = getHeight(root.right) + 1;

        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }

    public static TreeNode insert(TreeNode root, int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
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
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
}
