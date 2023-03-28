package Logical_Questions_1;

import java.util.Scanner;

public class Ques_28 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        /* int t=a;
        a=b;
        b=t;
         */
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
