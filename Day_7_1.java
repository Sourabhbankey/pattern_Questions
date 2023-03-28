package Logical_Questions_1;

public class Day_7_1 {
    public static void main(String[] args) {
        int N= 10;
        int sum = 0;
        System.out.println("First " + N + " Number = ");
        for(int i=1; i<=N; i++){

            System.out.println(i+ " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of first " + N + " Natural Number = " + sum);
    }
}
