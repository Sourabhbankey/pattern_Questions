package Logical_Questions_1;

import java.util.Scanner;

public class Ques_59 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
     for(int i=1; i<=n; i++){
         for(int j=1; j<=n-i+1; j++){
             System.out.print(" * ");
         }
         System.out.println();
      }
    }
}
