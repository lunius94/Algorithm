package backjoon.basicmath;
import java.io.*;
import java.util.*;

public class Q1929 {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        prime = new boolean[N+1];
        getPrime();

        for(int i = M; i<=N; i++) {
            if(!prime[i]) System.out.println(i);
        }
    }

    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length-1); i++) {
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
