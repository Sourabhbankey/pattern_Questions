package Logical_Questions_1;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value of Maths");
        int Maths = kb.nextInt();
        System.out.println("Enter the value of Computer");
        int Computer = kb.nextInt();
        System.out.println("Enter the value of English");
        int English = kb.nextInt();
        int total;
        total = Maths+Computer+English;
        double percentage = (total/3);

        System.out.println("Total marks = "+total);
        System.out.println("percentage = "+percentage);


    }
}
