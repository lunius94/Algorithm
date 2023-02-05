package backjoon.binarysearch.silver;
import java.io.*;
import java.util.*;

public class Q1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        long max = 0;

        for(int i = 0; i < N; i++) {
            arr[i]= Integer.parseInt(br.readLine());
            if(max<arr[i]) max = arr[i];
        }
        max++;

        long start = 0;
        while(start<max) {
            int sum = 0;
            long mid = (start+max)/2;
            for(int i = 0; i < N; i++) {
                sum += arr[i]/mid;
            }
            if(sum<M) max = mid;
            else start = mid+1;

        }
        System.out.println(start-1);
    }
}
