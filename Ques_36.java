package Logical_Questions_1;

import java.util.Scanner;

public class Ques_36 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        for(int num =0; num < a; num++)
        if(a%3==1 || a%5==1){
            System.out.println("This is not divisible by three");
        }
        else{
            System.out.println("divisible by 3");
        }

    }
}
