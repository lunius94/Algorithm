package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String msg = br.readLine();

            if(msg.startsWith("push")) {
                dq.offerLast(Integer.parseInt(msg.substring(5)));
            }
            else if(msg.startsWith("pop")) {
                if(dq.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(dq.pop()).append("\n");
                }
            }
            else if(msg.startsWith("size")) {
                sb.append(dq.size()).append("\n");
            }
            else if(msg.startsWith("empty")) {
                if(dq.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if(msg.startsWith("front")) {
                if(dq.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(dq.peekFirst()).append("\n");
                }
            }
            else {
                if(dq.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(dq.peekLast()).append("\n");
                }
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }
}
