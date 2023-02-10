package backjoon.datastructure.stackandqueue.queue.silver;
import java.io.*;
import java.util.*;

public class Q1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) {
                if(pq.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
            else {
                pq.offer(num);
            }
        }
        System.out.println(sb);
    }
}
