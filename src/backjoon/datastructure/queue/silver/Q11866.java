package backjoon.datastructure.queue.silver;
import java.io.*;
import java.util.*;

public class Q11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <=N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder("<");
        while(queue.size()>0){
            int count = 1;
            while(count++<K) {
                queue.offer(queue.poll());
            }
            if(queue.size()==1) sb.append(queue.poll()+">");
            else sb.append(queue.poll()+", ");
        }
        System.out.println(sb);
    }
}
