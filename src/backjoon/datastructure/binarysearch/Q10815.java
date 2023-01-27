package backjoon.datastructure.binarysearch;

import java.util.*;
import java.io.*;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (binarySearch(number, arr)) sb.append("1 ");
            else sb.append("0 ");
        }
        System.out.println(sb.toString());

    }

    public static boolean binarySearch(int n, int[] arr) {
        int start = 0;
        int dst = arr.length - 1;
        while (start < dst) {
            int mid = (start + dst) / 2;
            if (arr[start] == n || arr[dst] == n || arr[mid] == n) return true;
            else {
                if (arr[mid] > n) dst = mid - 1;
                else start = mid + 1;
            }
        }
        return false;
    }
}
