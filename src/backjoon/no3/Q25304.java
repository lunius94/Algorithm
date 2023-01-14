package backjoon.no3;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int cost = sc.nextInt();
            int count = sc.nextInt();
            sum += cost*count;
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
