package Logical_Questions_1;

import java.util.Scanner;

public class Ques_37 {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int a = kb.nextInt();
    for (int i=1; i<a; i++){
        if(a%i==0)
            System.out.println(i+"");
    }
   }
}
