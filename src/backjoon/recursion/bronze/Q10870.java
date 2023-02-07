package backjoon.recursion.bronze;
import java.io.*;

public class Q10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursion(N));

    }
    public static int recursion(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        return recursion(N-1)+recursion(N-2);
    }
}
