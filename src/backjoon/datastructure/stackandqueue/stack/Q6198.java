package backjoon.datastructure.stackandqueue.stack;
import java.io.*;
import java.util.*;

public class Q6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        long sum = 0;


        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            stack.push(i);
            sum += stack.size() - 1;
        }
        System.out.println(sum);
    }
}
