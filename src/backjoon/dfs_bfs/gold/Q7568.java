package backjoon.dfs_bfs.gold;
import java.io.*;
import java.util.*;

public class Q7568 {
    static int[][][] tomatoes;
    static int M,N,H;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomatoes = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k<M; k++) {
                    tomatoes[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomatoes[i][j][k]==1) queue.offer(new int[]{i, j, k});
                }
            }
        }
        int result= bfs(queue);
        System.out.println(result);

    }
    static int bfs(Queue<int[]> queue) {
        int[] dz = {-1,1,0,0,0,0};
        int[] dy = {0,0,-1,1,0,0};
        int[] dx = {0,0,0,0,-1,1};
        int result = 1;
        while(!queue.isEmpty()) {
            int z= queue.peek()[0];
            int y = queue.peek()[1];
            int x = queue.poll()[2];
            for(int i = 0; i<6; i++) {
                int cz = z+dz[i], cy=y+dy[i], cx = x+dx[i];
                if(cz<0 || cz>=H || cy<0 || cy>=N || cx<0 || cx>=M) {
                    continue;
                }
                if(tomatoes[cz][cy][cx]==0) {
                    tomatoes[cz][cy][cx]= tomatoes[z][y][x]+1;
                    result = tomatoes[cz][cy][cx];
                    queue.offer(new int[]{cz, cy, cx});
                }
            }
        }
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k<M; k++) {
                    if(tomatoes[i][j][k]==0) return -1;
                }
            }
        }
        return result-1;
    }
}
