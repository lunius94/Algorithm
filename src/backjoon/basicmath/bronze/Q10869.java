package backjoon.basicmath.bronze;

import java.util.Scanner;

public class Q10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A / B;
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(C);
        System.out.println(A % B);
    }
}
