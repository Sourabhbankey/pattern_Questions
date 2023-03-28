package Logical_Questions_1;

import java.util.Scanner;

public class Ques_74 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] arr = new int[n];
        int index = 0;
        for (int i=0; i<arr.length; i++){
            arr[i]=kb.nextInt();

        }
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
            
        }
    }
}
