package backjoon.basicmath;
import java.io.*;

public class Q4948 {
    public static boolean[] prime = new boolean[123456*2+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getPrime();
        while(true) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            else {
                for(int i = n+1; i<=2*n; i++) {
                    if(!prime[i]) count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void getPrime() {
        prime[0]=true;
        prime[1]=true;
        for(int i =0; i <= Math.sqrt(prime.length-1); i++) {
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
