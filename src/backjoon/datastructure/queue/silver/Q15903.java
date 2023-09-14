package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        long result = 0;

        arr = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            pq.add(Long.parseLong(arr[i]));
        }

        while(M-->0) {
            long tmp = pq.poll() + pq.poll();
            pq.add(tmp);
            pq.add(tmp);
        }

        while(!pq.isEmpty()) {
            result += pq.poll();
        }

        System.out.println(result);
    }
}
