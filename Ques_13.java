package Logical_Questions_1;

import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char gender = kb.nextLine().charAt(0);
        if(gender=='M' || gender=='m')
            System.out.println("Good morning sir");
        else if(gender=='F' || gender=='f')
            System.out.println("Good morning maam");
        else
            System.out.println("Invalid charater");

    }
}
