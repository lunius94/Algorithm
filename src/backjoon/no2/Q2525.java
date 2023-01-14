package backjoon.no2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        if (M + T >= 60) {
            H += (M + T) /60;
            M = (M + T) % 60;
            if (H >= 24) {
                H %= 24;
                System.out.println(H + " " + M);
            } else {
                System.out.println(H + " " + M);
            }
        } else {
            System.out.println(H + " " + (M + T));
        }
    }
}