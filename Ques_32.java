package Logical_Questions_1;

import java.util.Scanner;

public class Ques_32 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i=1; i<=10;  i++)
                System.out.println(n + " * " + i + " = "+ n*i);
    }
}
