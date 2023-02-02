package backjoon.implement.bronze;
import java.io.*;

public class Q2472 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = N; i>=1; i--) {
            sb.append(i+"\n");
        }
        System.out.println(sb);
    }
}
