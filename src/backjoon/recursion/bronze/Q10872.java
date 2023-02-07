package backjoon.recursion.bronze;
import java.io.*;

public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursion(N));
    }
    public static int recursion(int N) {
        if(N==0) return 1;
        return N*recursion(N-1);
    }
}
