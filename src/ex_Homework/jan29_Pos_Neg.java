package ex_Homework;

import java.util.Scanner;

public class jan29_Pos_Neg {
    public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();

    if(num > 0)
            System.out.println(num + " is positive");
    else if(num < 0)
            System.out.println(num + " is negative");
    else
        System.out.println(num + "is zero");
}
}

