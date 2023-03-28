package Logical_Questions_1;

import java.util.Scanner;

public class Ques_34 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int fact =1;
      for (int i=1; i<=n; i++){
          fact *=i;
      }
        System.out.println(fact);
    }
}
