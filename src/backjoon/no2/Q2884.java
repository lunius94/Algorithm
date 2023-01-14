package backjoon.no2;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M - 45 < 0) {
            M += 15;
            H -= 1;
            if (H < 0) {
                H += 24;
                System.out.println(H + " " + M);
            } else {
                System.out.println(H+ " " + M);
            }
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
