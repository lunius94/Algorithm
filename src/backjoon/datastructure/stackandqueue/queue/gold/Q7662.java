package backjoon.datastructure.stackandqueue.queue.gold;
import java.io.*;
import java.util.*;
public class Q7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        while(TC-->0){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int N = Integer.parseInt(br.readLine());
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if(str.equals("I")) pq.offer(num);
                else {
                    if(!pq.isEmpty()) {
                        if(num==1) pq = remove(pq);
                        else pq.poll();
                    }
                }
            }
            if(pq.isEmpty()) System.out.println("Empty");
            else {
                int min = pq.peek();
                int max = 0;
                while(pq.size()>1) {
                    pq.poll();
                }
                max = pq.poll();
                System.out.println(max + " " + min);
            }

        }
    }
    static PriorityQueue<Integer> remove(PriorityQueue<Integer> pq) {
        int size = pq.size();
        if(size == 1) {
            pq.poll();
            return pq;
        }
        PriorityQueue<Integer> newPq = new PriorityQueue<>();
        for(int i = 0; i < size-1; i++) {
            newPq.offer(pq.poll());
        }
        return newPq;
    }
}
