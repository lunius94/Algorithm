package backjoon.dfs_bfs.gold;
import java.io.*;
import java.util.*;


public class Q7576_Success {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][N];

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < M; i++) {
            for(int j = 0; j<N; j++) {
                if(arr[i][j]==1){
                    queue.offer(new int[] {i,j});
                }
            }
        }
        int max = bfs(arr,queue);
        for(int i = 0; i < M; i++) {
            for(int j = 0; j<N; j++) {
                if(arr[i][j] ==0) max = -1;
            }
        }
        System.out.println(max);
    }
    static int bfs(int[][] arr, Queue<int[]> queue) {
        int count = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.poll()[1];
            count = arr[x][y]-1;
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx < 0 || cx >= arr.length || cy < 0 || cy >= arr[0].length) {
                    continue;
                }
                if (arr[cx][cy] == 0) {
                    queue.offer(new int[]{cx, cy});
                    arr[cx][cy] = arr[x][y] + 1;
                }
            }
        }
        return count;
    }
}
