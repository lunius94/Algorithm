package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][N+1];
        boolean[] visited = new boolean[N+1];
        for(int i = 0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        int count = 0;
        for(int j = 1; j<N+1; j++) {
            if(!visited[j] && arr[1][j] ==1) {
                count = bfs(arr,visited)-1;
            }
        }
        System.out.println(count);
    }

    static int bfs(int[][] arr, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int count = 0;
        while(!queue.isEmpty()) {
            int start = queue.poll();
            count++;
            visited[start] = true;
            for(int i = 1; i < arr.length; i++) {
                if(!visited[i] && arr[start][i]==1) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return count;
    }
}
