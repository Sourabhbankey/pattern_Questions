package Logical_Questions_1;

import java.util.Scanner;

public class Seireof_Eratos {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first =0,second = 1;
        int n = sc.nextInt();
        System.out.print(first+ " "+ second+" ");
        for (int i=1;i<=n;i++) {
            int third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }
}
