package Logical_Questions_1;

import java.util.Random;

public class Ques_71 {
    public static void main(String[] args) {
        String number = "04512151";
        Random ran = new Random();
        char[]otp = new char[4];
        for (int i=0; i<otp.length; i++){
            otp[i] = number.charAt(ran.nextInt(number.length()));
        }
        System.out.println(otp);
    }
}
