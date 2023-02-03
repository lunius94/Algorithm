package backjoon.basicmath.bronze;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = B % 100 / 10;
        int D = B / 100;
        System.out.println(A * (B % 10));
        System.out.println(A * C);
        System.out.println(A * D);
        System.out.println(A * B);
    }
}
