package Logical_Questions_1;

import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value of length");
        int length = kb.nextInt();
        System.out.println("Enter the value of width");
        int width = kb.nextInt();
        int area = length * width;
        int parameter = (length* width)*2;
        System.out.println("Area  is =");
        System.out.println(area);
        System.out.println("parameter  is");
        System.out.println((length+width)*2);

    }
}
