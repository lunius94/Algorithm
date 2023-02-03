package backjoon.basicmath.bronze;
import java.util.*;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int sum = 1;
        int n = 0;
        while (sum<target){
            sum += 6*n;
            if(sum>=target) break;
            n++;
        }
        System.out.println(n+1);
    }
}
