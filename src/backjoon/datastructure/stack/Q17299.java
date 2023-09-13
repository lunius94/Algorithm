package backjoon.datastructure.stack;
import java.io.*;
import java.util.*;

public class Q17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N+1];
        int[] counting = new int[1000001];
        for(int i = 1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            counting[arr[i]]++;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <= N; i++) {
            while(!stack.isEmpty() && counting[arr[stack.peek()]]<counting[arr[i]]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}
