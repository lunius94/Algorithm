package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        int last = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str) {
                case "push_front" :
                    last = Integer.parseInt(st.nextToken());
                    deque.offerFirst(last);
                    break;
                case "push_back" :
                    last = Integer.parseInt(st.nextToken());
                    deque.offerLast(last);
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) sb.append(-1+"\n");
                    else sb.append(deque.pollFirst()+"\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) sb.append(-1+"\n");
                    else sb.append(deque.pollLast()+"\n");
                    break;
                case "size" :
                    sb.append(deque.size()+"\n");
                    break;
                case "empty" :
                    if(deque.isEmpty()) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "front" :
                    if(deque.isEmpty()) sb.append(-1+"\n");
                    else sb.append(deque.peekFirst()+"\n");
                    break;
                case "back" :
                    if(deque.isEmpty()) sb.append(-1+"\n");
                    else sb.append(deque.peekLast()+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
