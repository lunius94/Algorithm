package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;


// 연결요소라는 개념을 놓치지 말자. 연결된 간선이 하나도 없는 접점도 연결요소다.
public class Q11724 {
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] connect = new int[N+1][N+1];
        while(M-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            connect[a][b] = 1;
            connect[b][a] = 1;
        }
        visited = new boolean[N+1];
        int count = 0;
        for(int i = 1;i < N+1; i++) {
            if(!visited[i]) {
                bfs(connect, i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void bfs(int[][] connect, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            start = queue.poll();
            for(int i = 1; i < connect.length; i++) {
                if(!visited[i] && connect[start][i] == 1) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
