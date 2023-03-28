package Logical_Questions_1;

import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp_in_faren = kb.nextInt();
        double temp_in_Celsuis = ((temp_in_faren-32)*5)/9;
        System.out.println(temp_in_Celsuis);
    }
}
