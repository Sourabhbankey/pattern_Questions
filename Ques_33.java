package Logical_Questions_1;

import java.util.Scanner;

public class Ques_33 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++){
           sum+=i;
        }
        System.out.println(sum);
    }
}
