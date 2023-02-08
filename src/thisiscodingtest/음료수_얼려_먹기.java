package thisiscodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 음료수_얼려_먹기 {
    static String[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        arr = new String[M][N];
        visited = new boolean[M][N];
        for(int i = 0; i< M; i++) {
            arr[i] = br.readLine().split("");
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j] && arr[i][j].equals("0")) {
                    bfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void bfs(int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{m,n});
        visited[m][n] = true;
        int[] dx = {1,-1,0,0};
        int[] dy = {0, 0, 1, -1};
        while(!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.poll()[1];
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx < 0 || cx >= arr.length || cy < 0 || cy >= arr[0].length) {
                    continue;
                }
                if (!visited[cx][cy] && arr[cx][cy].equals("0")) {
                    queue.offer(new int[]{cx, cy});
                    visited[cx][cy]= true;
                }
            }
        }
    }
}
