package backjoon.datastructure.setmap.silver;

import java.util.*;
import java.io.*;

public class Q2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Set<String> note1 = new HashSet<>();
            String[] arr1 = br.readLine().split(" ");

            for(int j = 0; j < N; j++) {
                note1.add(arr1[j]);
            }

            int M = Integer.parseInt(br.readLine());
            String[] arr2 = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                if(note1.contains(arr2[j])) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
