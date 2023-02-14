package backjoon.datastructure.stackandqueue.queue.gold;
import java.io.*;
import java.util.*;

public class Q7662_1 {
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        while(TC-->0) {
            sb.append(operate()).append("\n");
        }
        System.out.println(sb);
    }
    private static String operate() throws IOException {
        PriorityQueue<Integer> pqn = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        int inCount = 0;
        int outCount = 0;
        int N= Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            if(s.equals("I")) {
                pqn.offer(number);
                pqr.offer(number);
                inCount++;
            }
            else {
                if(number==1 && !pqr.isEmpty()) {
                    outCount++;
                    pqr.poll();
                }
                else if(number== -1 && !pqn.isEmpty()) {
                    outCount++;
                    pqn.poll();
                }
            }
            if(inCount==outCount) {
                pqr.clear();
                pqn.clear();
            }
        }
        if(pqr.isEmpty()) return "EMPTY";
        else {
            return pqr.poll() + " " + pqn.poll();
        }

    }
}
