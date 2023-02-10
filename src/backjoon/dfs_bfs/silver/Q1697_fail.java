package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q1697_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int dst = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start,dst));
    }
    static int bfs(int start, int dst) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {start,0,2});
        int count = 0;
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            start = cur[0];
            count = cur[1];
            if(start==dst) break;
            int prev = cur[2];
            for(int i = 0; i < 3; i++) {
                if (i ==0 && prev != 1) {
                    queue.offer(new int[] {start-1,count+1,0});
                } else if( i == 1 && prev !=0 && start<dst) {
                    queue.offer(new int[] {start+1,count+1,1});
                } else if( i == 2 && start<dst) {
                    queue.offer(new int[] {start*2,count+1,2});
                }
            }
        }
        return count;
    }
}
