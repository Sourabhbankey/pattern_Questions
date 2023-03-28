package Logical_Questions_1;

import java.util.Scanner;

public class Ques_35 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int first_range = kb.nextInt();
        int second_range = kb.nextInt();
        int evensum = 0, oddsum = 0;
        for (int i = first_range; i <= second_range; i++) {
            if (i % 2 == 0)
                evensum = i;
            else
                oddsum = i;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
