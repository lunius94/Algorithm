package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q1012 {
/*    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<int[]> queue = new LinkedList<>();
        while(T-->0){
            int earthwarm = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N+2][M+2];
            for(int i = 0; i <K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken())+1;
                int b = Integer.parseInt(st.nextToken())+1;
                arr[b][a] = 1;
            }

            // 넓이 우선 탐색
            for(int i = 1; i<=N; i++) {
                for(int j = 1; j<=M; j++) {
                    if(arr[i][j]==1) {
                        int[] cur= {i,j};
                        bfs(queue,arr,cur);
                        earthwarm++;
                    }
                }
            }
            sb.append(earthwarm+"\n");
        }
        System.out.println(sb);
    }

    static void bfs(Queue<int[]> queue, int[][] arr,int[] cur) {
        queue.offer(cur);
        while(!queue.isEmpty()) {
            cur = queue.poll();
            arr[cur[0]][cur[1]] = 0;
            if(arr[cur[0]+1][cur[1]]==1) queue.offer(new int[]{cur[0]+1,cur[1]});
            else if(arr[cur[0]-1][cur[1]]==1) queue.offer(new int[]{cur[0]-1,cur[1]});
            else if(arr[cur[0]][cur[1]+1]==1) queue.offer(new int[]{cur[0],cur[1]+1});
            else if(arr[cur[0]][cur[1]-1]==1) queue.offer(new int[]{cur[0],cur[1]-1});
        }
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();

        while(TC-->0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] arr = new int[M][N];

            while(K-->0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            int count = 0;
            for(int i=0; i<M; i++) {
                for(int j=0; j<N; j++) {
                    if(arr[i][j]==1) {
                        bfs(i,j,arr);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int a, int b,int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        int[] cur = {a,b};
        queue.offer(cur);
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        while(!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            arr[x][y] = 0;
            queue.poll();
            for(int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || nx>=arr.length || ny<0 || ny>=arr[0].length) continue;
                if(arr[nx][ny]==1) {
                    queue.offer(new int[]{nx,ny});
                    arr[nx][ny]=0;
                };
            }
        }
    }
}
