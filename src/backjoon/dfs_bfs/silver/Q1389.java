package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q1389 {
    static int[][] friends;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        friends = new int[N+1][N+1];

        while(M-->0) {
            st= new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            friends[A][B] = 1;
            friends[B][A] = 1;
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 1; i < friends.length; i++) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[] {i,0});
            boolean[] visited = new boolean[N+1];
            visited[i] = true;
            int sum = 0;
            while(!queue.isEmpty()) {
                int[] arr = queue.poll();
                int start = arr[0];
                int count = arr[1];
                for(int j = 1; j<friends.length; j++) {
                    if(!visited[j] && friends[start][j]==1) {
                        visited[j] = true;
                        sum += count+1;
                        queue.offer(new int[]{j,count+1});
                    }
                }
            }

            if(min>sum) {
                min = sum;
                result = i;
            }
        }
        System.out.println(result);
    }
}

