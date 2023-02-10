package backjoon.dfs_bfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697_success {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int dst = Integer.parseInt(st.nextToken());
        int length = Math.max(start,dst)*2;
        if(start == dst) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if(cur==dst){
                count = arr[cur];
                break;
            }
            for(int i = 0; i < 3; i ++) {
                if(i == 0 && cur-1>=0 && arr[cur-1]==0 ) {
                    arr[cur - 1] = arr[cur] + 1;
                    queue.offer(cur-1);
                }
                else if(i==1&& cur+1<length && arr[cur+1]==0) {
                    arr[cur+1] = arr[cur] +1;
                    queue.offer(cur+1);
                }
                else if(i==2 && cur*2<length && arr[cur*2] == 0) {
                    arr[cur*2] = arr[cur] +1;
                    queue.offer(cur*2);
                }
            }
        }
        System.out.println(count);
    }
}
