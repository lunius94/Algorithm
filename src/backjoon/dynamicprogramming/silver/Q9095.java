package backjoon.dynamicprogramming.silver;
import java.io.*;
import java.util.*;

public class Q9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i = 4; i < 12; i++) {
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        while(TC-->0){
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N]).append("\n");
        }
        System.out.println(sb);
    }
}
