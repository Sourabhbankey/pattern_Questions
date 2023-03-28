package Logical_Questions_1;

import java.util.Scanner;

public class Test_SI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int p = kb.nextInt();
        int r = kb.nextInt();
        int t = kb.nextInt();
        int SI = (p*r*t)/100;
        System.out.println(SI);
    }
}
