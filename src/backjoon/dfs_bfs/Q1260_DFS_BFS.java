package backjoon.dfs_bfs;

import java.io.*;
import java.util.*;

public class Q1260_DFS_BFS {
    static boolean[] visited;
    static int[][] matrix;
    static StringBuilder sb = new StringBuilder();

    static int vertex, edge, start;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        matrix = new int[vertex+1][vertex+1];
        for(int i = 0; i<edge; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }
        visited = new boolean[vertex+1];

        dfs(start);
        sb.append("\n");
        visited = new boolean[vertex+1];

        bfs(start);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start+" ");

        for(int i = 1; i<matrix.length; i++) {
            if(matrix[start][i] ==1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        sb.append(start+" ");
        visited[start] = true;

        while(!queue.isEmpty()) {
            start = queue.poll();

            for(int i = 1; i<matrix.length; i++) {
                if(matrix[start][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    sb.append(i + " ");
                }
            }
        }
    }
}
