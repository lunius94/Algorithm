package backjoon.basicmath.bronze;
import java.io.*;

public class Q2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apart = new int[k + 1][n + 1];
            for (int zero = 0; zero <= n; zero++) {
                apart[0][zero] = zero;
            }
            for (int a = 1; a <= k; a++) {
                for (int b = 1; b <= n; b++) {
                    apart[a][b] = apart[a][b - 1] + apart[a - 1][b];
                }
            }
            System.out.println(apart[k][n]);
        }
    }
}
