package backjoon.datastructure.binarysearch;
import java.io.*;
import java.util.*;

public class Q1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < M; i++) {
            if(binarySearch(arr,Integer.parseInt(st.nextToken()))>0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }

    public static int binarySearch(int[] arr, int num) {
        int first = 0;
        int last = arr.length-1;

        while(first<=last) {
            int mid = (first+last)/2;
            if(num==arr[mid]) return 1;
            else if(num<arr[mid]) last = mid-1;
            else first = mid+1;
        }
        return -1;
    }
}
