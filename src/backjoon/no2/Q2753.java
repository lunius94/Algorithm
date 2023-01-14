package backjoon.no2;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = A%100;
        int C = A%400;
        if (A%4 == 0) {
            if (B ==0 && C == 0) {
                System.out.println(1);
            } else if (B == 0 && C !=0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }
    }
}
