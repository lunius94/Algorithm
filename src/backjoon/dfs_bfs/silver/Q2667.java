package backjoon.dfs_bfs.silver;
import java.io.*;
import java.util.*;

public class Q2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for(int j= 0; j< N; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i =0; i< N; i++) {
            for(int j = 0; j<N; j++) {
                if(arr[i][j] ==1) {
                    arr[i][j] = 0;
                    count = bfs(i,j, arr);
                    list.add(count);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);

    }
    static int bfs(int num1, int num2, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{num1,num2});
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        int count = 0;
        while(!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.poll()[1];
            count++;
            for(int i = 0; i<4; i++) {
                int cx = x +dx[i];
                int cy = y +dy[i];
                if(cx<0 || cx>=arr.length || cy<0 || cy>=arr.length) {
                    continue;
                }
                if(arr[cx][cy]==1) {
                    queue.offer(new int[]{cx,cy});
                    arr[cx][cy]=0;
                }
            }
        }
        return count;
    }
}
