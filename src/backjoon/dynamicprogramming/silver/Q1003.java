package backjoon.dynamicprogramming.silver;
import java.io.*;
import java.util.*;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] counting;
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            int num = Integer.parseInt(br.readLine());
            counting = new int[num+1][2];
            counting[0][0] = 1;
            counting[1][1] = 1;
            for(int i = 2; i <= num; i++) {
                counting[i][0] = counting[i-1][0]+counting[i-2][0];
                counting[i][1] = counting[i-1][1]+counting[i-2][1];
            }
            sb.append(counting[num][0]).append(" ").append(counting[num][1]).append("\n");
        }
        System.out.println(sb);
    }
}
