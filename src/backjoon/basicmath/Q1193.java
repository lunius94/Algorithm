package backjoon.basicmath;
import java.util.*;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int sum = 1;
        int n = 1;
        String result ="1/1";

        while(x>sum){
            n++;
            sum += n;
            if(sum>=x) {
                int num = sum-x;
                result = n%2==0? String.format("%d/%d",n-num,1+num):String.format("%d/%d",1+num,n-num);
            }
        }
        System.out.println(result);
    }
}
