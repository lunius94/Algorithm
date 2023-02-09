package backjoon.dfs_bfs.gold;
import java.io.*;
import java.util.*;


// 시간초과를 어떻게 해결하지?

public class Q7576_TimeOver {
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

        for(int i = 0; i < M; i++) {
            for(int j = 0; j<N; j++) {
                if(arr[i][j]==1){
                    bfs(i,j,arr);
                }
            }
        }
        int max = 0;
        boolean containsZero = false;
        for(int i = 0; i<M; i++) {
            for(int j = 0; j<N; j++) {
                if(max<arr[i][j]) {
                    max=arr[i][j];
                }
                if(arr[i][j] == 0) {
                    containsZero = true;
                }
            }
        }
        if(containsZero) System.out.println(-1);
        else System.out.println(max-1);

    }
    static void bfs(int num1, int num2, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        visited[num1][num2] = true;
        queue.offer(new int[]{num1, num2});
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.poll()[1];
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx < 0 || cx >= arr.length || cy < 0 || cy >= arr[0].length) {
                    continue;
                }
                if (arr[cx][cy] == 0) {
                    queue.offer(new int[]{cx, cy});
                    arr[cx][cy] = arr[x][y] + 1;
                    visited[cx][cy] = true;
                } else if (arr[cx][cy] == 1 || arr[cx][cy] == -1) {
                    continue;
                } else if (!visited[cx][cy]) {
                    if (arr[cx][cy] > arr[x][y] + 1) {
                        arr[cx][cy] = arr[x][y] + 1;
                        visited[cx][cy] = true;
                        queue.offer(new int[]{cx, cy});
                    }
                }
            }
        }
    }
}
