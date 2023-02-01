package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i]*(N-i);
        }
        System.out.println(sum);
    }
}
