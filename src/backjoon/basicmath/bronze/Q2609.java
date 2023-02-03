package backjoon.basicmath.bronze;
import java.io.*;
import java.util.*;

public class Q2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int gcd = getGCD(N,M);
        int lcm = (int) (N*M/gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int getGCD(int num1, int num2) {
        if(num1%num2==0) return num2;
        return getGCD(num2, num1%num2);
    }
}
