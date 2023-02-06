package backjoon.bruteforce.silver;
import java.io.*;
import java.util.*;

public class Q18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max) max = arr[i][j];
                if(arr[i][j]<min) min = arr[i][j];
            }
        }
        int count = Integer.MAX_VALUE;
        int height = 0;
        // 모든 경우의 수 탐색 시작
        while(min<=max) {
            int curBlock = B;
            int curCount = 0;
            int diff;
            for(int i = 0; i <N; i++) {
                for(int j = 0; j<M; j++) {
                    if(arr[i][j]>min) {
                        diff = arr[i][j]-min;
                        curCount += diff*2;
                        curBlock += diff;
                    }
                    else if(arr[i][j]<min) {
                        diff = min - arr[i][j];
                        curCount += diff;
                        curBlock -= diff;
                    }
                }
            }
            if(curBlock<0) break;
            if(curCount<count) {
                count = curCount;
                height = min;
            } else if(curCount==count) {
                height = Math.max(height,min);
            }
            min++;
        }
        if(min == Integer.MAX_VALUE) count = 0;
        System.out.println(count+" "+height);
    }
}
