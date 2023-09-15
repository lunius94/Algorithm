package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int size = Integer.parseInt(arr[1]);
        int max = Integer.parseInt(arr[2]);

        arr = br.readLine().split(" ");

        Queue<Integer> waiting = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            waiting.add(Integer.parseInt(arr[i]));
        }
        for(int i = 0; i < size; i++) {
            bridge.add(0);
        }

        int curWeight = 0;
        int result = 0;

        while(!waiting.isEmpty()) {
            int tmp = waiting.peek();
            result++;
            curWeight -= bridge.poll();
            if(curWeight + tmp > max) {
                bridge.add(0);
            }
            else {
                curWeight += tmp;
                bridge.add(waiting.poll());
            }
        }

        System.out.println(result+size);
    }
}
