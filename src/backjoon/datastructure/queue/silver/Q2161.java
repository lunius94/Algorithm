package backjoon.datastructure.queue.silver;

import java.util.*;
import java.io.*;

public class Q2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> qu = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 1; i <= N; i++) {
            qu.add(i);
        }
        boolean isThrow = true;
        while(!qu.isEmpty()) {
            if(isThrow) {
                sb.append(qu.poll());
                if(!qu.isEmpty()) {
                    sb.append(" ");
                }
                isThrow = false;
            }
            else {
                qu.add(qu.poll());
                isThrow = true;
            }
        }
        System.out.println(sb.toString());
    }
}
