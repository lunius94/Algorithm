package backjoon.basicmath;
import java.io.*;

public class Q9020 {
    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        getPrime();

        for(int i = 0 ; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int mid = n/2;
            for(int j = 0; j<mid; j++) {
                if(!prime[mid-j] && !prime[mid+j]) {
                    System.out.printf("%d %d\n",mid-j,mid+j);
                    break;
                }
            }
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
