package ex_Homework;

import java.util.Scanner;

public class jan29_vote {
    public static void main(String[] args) {
    // Allowed to vote or not
    // If age > 18 -> allowed to vote.
    // else age < >18 -> Not allowed to vote.

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age!(as integer)");
    int age = sc.nextInt(); // java.util.InputMismatchException


    if (age > 18) {
        System.out.println("Allowed to vote!");
    } else {
        System.out.println("Not Allowed!");
    }
}
}

