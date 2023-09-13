package backjoon.datastructure.queue.silver;

import java.util.*;
import java.io.*;

public class Q1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < M-1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;

        while(!pq.isEmpty()){
            if(N > pq.peek()) {
                break;
            }
            else {
                N += 1;
                pq.add(pq.poll()-1);
                answer++;
            }

        }

        System.out.println(answer);
    }
}
