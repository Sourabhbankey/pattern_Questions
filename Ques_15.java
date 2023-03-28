package Logical_Questions_1;

import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your age ");
        int a = kb.nextInt();
        if(a>=18 || a<=50 ){
            System.out.println("your are eligibal for voting");
        }
        else if(a<=51){
            System.out.println("you are not eligibal");
        }
    }
}
