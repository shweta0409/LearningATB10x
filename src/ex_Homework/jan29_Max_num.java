package ex_Homework;

import java.util.Scanner;

public class jan29_Max_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        if(n1>n2)
        {
            System.out.println("First number is greater");
        }
        else if(n1==n2)
        {
            System.out.println("Both numbers are equal");
        }
        else
        {
            System.out.println("Second number is greater");
        }
    }
}
