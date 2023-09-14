package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minusQu = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> plusQu = new PriorityQueue<>();

        for(int i = 0; i < N ; i++) {
            int M = Integer.parseInt(br.readLine());
            if(M>0) {
                plusQu.add(M);
            }
            else if(M<0) {
                minusQu.add(M);
            }
            else {
                if(plusQu.isEmpty() && minusQu.isEmpty()) {
                    System.out.println(0);
                }
                else if(plusQu.isEmpty()) {
                    System.out.println(minusQu.poll());
                }
                else if(minusQu.isEmpty()) {
                    System.out.println(plusQu.poll());
                }
                else if(plusQu.peek() >= Math.abs(minusQu.peek())) {
                    System.out.println(minusQu.poll());
                }
                else {
                    System.out.println(plusQu.poll());
                }
            }
        }
    }
}
