package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine()," ");
        StringTokenizer stB = new StringTokenizer(br.readLine()," ");
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i< N; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
            B[i] = Integer.parseInt(stB.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A[i] * B[N-1-i];
        }
        System.out.println(sum);
    }
}
