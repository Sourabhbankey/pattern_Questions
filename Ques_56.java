package Logical_Questions_1;

import java.util.Scanner;

public class Ques_56 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
       for(int i=0; i<6; i++){
           for(int j=0; j<i; j++){
               System.out.print(" * ");
           }
           System.out.println();
       }
    }
}