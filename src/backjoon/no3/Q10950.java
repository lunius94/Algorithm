package backjoon.no3;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            num[i] = sum;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(num[i]);
        }
    }
}
