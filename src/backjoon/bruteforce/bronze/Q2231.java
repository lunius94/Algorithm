package backjoon.bruteforce.bronze;
import java.io.*;

public class Q2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i<N; i++) {
            int num = sum(i);
            if(num==N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
    static int sum(int num) {
        int sum = num;
        while(num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
