package ex_Homework;

import java.util.Scanner;

public class jan30_small_two_num {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        System.out.print("Enter The Number : ");
        num1 = input.nextDouble();

        System.out.print("Enter The Number : ");
        num2 = input.nextDouble();

        System.out.print("Smallest Number is : " + Math.min(num1, num2));
    }
}

