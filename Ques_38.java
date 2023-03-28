package Logical_Questions_1;

import java.util.Scanner;

public class Ques_38 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb. nextInt();
        int sum = 0;
        for(int i=1; i<a; i++){
            if(a%i==0)
                sum +=i;
        }
        System.out.println(sum);

    }
}
