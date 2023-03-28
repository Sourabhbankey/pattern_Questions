package Logical_Questions_1;

import java.util.Scanner;

public class Ques_72 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s ="";
        int sum =0;
        int  arr[] = new int[n];
        for(int i=0; i<=arr.length; i++){
            arr[i]= kb.nextInt();
            if(i==arr.length-1){
                s+=arr[i];
                sum+=arr[i];
            }else {
                s+=arr[i]+" + ";
                sum +=arr[i];
            }
        }
        System.out.println(s+" = "+sum);
    }
}
