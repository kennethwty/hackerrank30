package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task: Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
    You will then be given an unknown number of names to query your phone book for.
    For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
    if an entry for name is not found, print "Not found" instead.

    Sample Input:
        3
        sam 99912222
        tom 11122222
        harry 12299933
        sam
        edward
        harry

    Sample Output:
        sam=99912222
        Not found
        harry=12299933
*/
public class Day8 {
    public static void main(String[] args) {
        int n; //number of entries

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if(s.equals("0")) return;
            if(phoneBook.containsKey(s))
                System.out.println(s + "=" + phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
