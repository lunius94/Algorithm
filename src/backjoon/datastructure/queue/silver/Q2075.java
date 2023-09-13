package backjoon.datastructure.queue.silver;
import java.io.*;
import java.util.*;

public class Q2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                pq.add(Integer.parseInt(arr[j]));
            }
        }

        int result = 0;

        while(N-->0) {
            int tmp = pq.poll();
            if(N==0) result = tmp;
        }

        System.out.println(result);
    }
}
