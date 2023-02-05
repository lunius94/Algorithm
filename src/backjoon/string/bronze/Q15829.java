package backjoon.string.bronze;
import java.io.*;

public class Q15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int M = 1234567891;
        long result =0;
        long pow=1;
        for(int i = 0; i < N; i++) {
            result += (str.charAt(i)-'a'+1)*pow%M;
            pow = pow*31%M;
        }
        System.out.println(result%M);
    }
}
