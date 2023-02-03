package backjoon.datastructure.stackandqueue.queue;
import java.io.*;
import java.util.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[M];
            st = new StringTokenizer(br.readLine()," ");

            for(int j = 0; j<M; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int target = arr[K];
            Arrays.sort(arr,Collections.reverseOrder());
            Queue<Integer> queue = new LinkedList<>(Arrays.asList(arr));

            int count = 0;
            while(!queue.isEmpty()) {
                int cur = queue.poll();
                if(cur>=target) count++;
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);

    }
}
