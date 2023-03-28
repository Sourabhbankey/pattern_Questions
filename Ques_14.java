package Logical_Questions_1;

import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int N = kb.nextInt();
        if(N%2==0){
            System.out.println("Number is even");
        }
        else if(N%2==1){
            System.out.println("Number is odd");
        }

    }
}
