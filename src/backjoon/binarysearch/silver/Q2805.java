package backjoon.binarysearch.silver;
import java.io.*;
import java.util.*;

public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int maxHeight = 0;
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>maxHeight) maxHeight = arr[i];
        }

        int start = 0;


        // upper bound;
        while(start<maxHeight) {
            long sum = 0;
            int mid = (start+maxHeight)/2;
            for(int i =0; i<N; i++) {
                int curHeight = arr[i]-mid>0? arr[i]-mid:0;
                sum += curHeight;
            }
            if(sum<M) maxHeight = mid;
            else start = mid+1;
        }
        System.out.println(start-1);
    }
}
