package backjoon.datastructure.queue.silver;

import java.io.*;
import java.util.*;

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int result = 0;

        String[] arr2 = br.readLine().split(" ");
        Queue<Integer> qu = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            qu.add(i);
        }

        for(int i = 0; i < arr2.length; i++) {
            int cnt = 0;
            int length = qu.size();
            int target = Integer.parseInt(arr2[i]);

            while(true) {
                int tmp = qu.poll();
                if(tmp != target) {
                    qu.add(tmp);
                    cnt++;
                }
                else if(cnt > length/2) {
                    cnt = length-cnt;
                    break;
                }
                else {
                    break;
                }
            }
            result += cnt;
        }

        System.out.println(result);
    }
}
