package Logical_Questions_1;

import java.util.Scanner;

public class Ques_70 {
    //fibonacci
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("ENTER YOUR VALUE");
    int first =0,second =1,third;
    int n = kb.nextInt();
        System.out.println(first+" "+second+" ");
        for(int i=0; i<=n; i++){
            third = first+ second;
            first = second;
            second = third;
            System.out.println(third +" ");
        }
    }
}
