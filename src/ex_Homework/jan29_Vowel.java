package ex_Homework;

import java.util.Scanner;

public class jan29_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);

        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')

            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}

