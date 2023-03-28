package Logical_Questions_1;

import java.util.Scanner;

public class Ques_22 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int marks = kb.nextInt();
        String Grades =" ";
        if(marks>=91 && marks <=100){
            Grades = "AA";
        }else if(marks>=81 && marks <=90){
            Grades = "AB";
        }else if(marks>=71 && marks <=80){
            Grades = "BB";
        }else if(marks>=61 && marks <=70){
            Grades = "BC";
        }else if(marks>=51 && marks <=60){
            Grades = "CD";
        }else if(marks>=41 && marks <=50){
            Grades = "DD";
        }
        if(marks>=0 && marks <=40){
            Grades = "F";
        }
        System.out.println(Grades);
    }
}
