package backjoon.datastructure.stackandqueue.stack;
import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/17298
 */

public class Q17298_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for(int i = 0; i< N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< N; i++) {

            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        for(int i = 0; i < N; i++) {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}
