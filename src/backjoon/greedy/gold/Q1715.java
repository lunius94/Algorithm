package backjoon.greedy.gold;
import java.io.*;
import java.util.*;

public class Q1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N;  i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        if(N==1) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        while(pq.size()>1) {
            int num  = pq.poll() + pq.poll();
            sum += num;
            pq.offer(num);
        }
        System.out.println(sum);
    }
}
