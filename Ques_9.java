package Logical_Questions_1;

import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your 3 number");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c  = kb.nextInt();

        if(a==b && b==c){
            System.out.println("ALl  are equal");
        }
        else if(a==b || b==c || c==a)  {
            System.out.println("Any  of two are Equal");
        }
        else{
            System.out.println("All are not equal");
        }
    }
}
