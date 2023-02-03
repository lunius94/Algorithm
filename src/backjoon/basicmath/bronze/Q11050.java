package backjoon.basicmath.bronze;
import java.io.*;
import java.util.*;

public class Q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for(int i = 1; i<=N; i++) {
            num1*=i;
        }
        for (int i = 1; i<=K; i++) {
            num2*=i;
        }
        for(int i = 1; i<=N-K; i++) {
            num3*=i;
        }
        System.out.println((int)(num1/num2/num3));

    }
}
