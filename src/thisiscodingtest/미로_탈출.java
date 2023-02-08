package thisiscodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로_탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++) {
            String[] stringArr = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(stringArr[j]);
            }
        }
        bfs(0,0,arr);
        System.out.println(arr[M-1][N-1]);

    }

    static void bfs(int m, int n, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{m, n});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.poll()[1];

            for (int i = 0; i < 4; i++) {
                int cx = x +dx[i];
                int cy = y + dy[i];
                if(cx<0 || cx>=arr.length||cy<0 || cy>=arr[0].length) {
                    continue;
                }
                if(arr[cx][cy]==1) {
                    queue.offer(new int[]{cx, cy});
                    arr[cx][cy]=arr[x][y]+1;
                }
            }
        }
    }
}
