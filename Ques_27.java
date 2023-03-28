package Logical_Questions_1;

import java.util.Scanner;

public class Ques_27 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char a = kb.nextLine().charAt(0);
        if(a == 'A' || a == 'E' || a == 'I'||a == 'O' || a == 'U' ||
        a == 'a' || a == 'e' || a == 'i'||a == 'o' || a == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consent");
        }
    }
}
