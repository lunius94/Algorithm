package backjoon.datastructure.stackandqueue.queue.silver;

import java.util.*;
import java.io.*;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]);
        int K = Integer.parseInt(tmp[1]);

        Queue<Integer> qu = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            qu.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int cnt = 1;

        while(!qu.isEmpty()) {
            int num = qu.poll();
            if(cnt == K) {
                sb.append(num);
                cnt = 1;
                if(!qu.isEmpty()) {
                    sb.append(", ");
                }
            }
            else {
                qu.add(num);
                cnt++;
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
