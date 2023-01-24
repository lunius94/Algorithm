package backjoon.basicmath;
import java.util.*;

public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(B>=C) System.out.println(-1);
        else {
            int result = A/(C-B);
            System.out.println(result+1);
        }
    }
}
