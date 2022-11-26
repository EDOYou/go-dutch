package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt(); // Total amount of bill
        int friends = sc.nextInt(); // Number of friends
        int bill; // Bill to be paid, including tips
        int foreach; // Bill after splitting (equally) amongst friends

        if (total < 0) System.out.println("Bill total amount cannot be negative");
        else if (friends <= 0) System.out.println("Number of friends cannot be negative or zero");
        else {
            bill = total + total * 10 / 100;
            foreach = bill / friends;
            System.out.println(foreach);
        }
    }
}
