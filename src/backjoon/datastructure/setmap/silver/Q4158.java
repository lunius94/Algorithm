package backjoon.datastructure.setmap.silver;

import java.io.*;
import java.util.*;


public class Q4158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] tmpArr = br.readLine().split(" ");
            int M = Integer.parseInt(tmpArr[0]);
            int N = Integer.parseInt(tmpArr[1]);

            if(N == 0 && M == 0) break;
            Set<Integer> set = new HashSet<>();

            for(int i = 0; i < M; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            int answer = 0;
            for(int i = 0; i < N; i++) {
                if(set.contains(Integer.parseInt(br.readLine()))) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
