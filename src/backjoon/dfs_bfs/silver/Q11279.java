package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb= new StringBuilder();
        while(N-->0) {
            int number = Integer.parseInt(br.readLine());
            if(number == 0) {
                if(pq.isEmpty()) sb.append(0).append("\n");
                else sb.append(pq.poll()).append("\n");
            }
            else {
                pq.offer(number);
            }
        }
        System.out.println(sb);
    }
}
