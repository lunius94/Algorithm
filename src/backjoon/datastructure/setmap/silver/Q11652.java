package backjoon.datastructure.setmap.silver;

import java.io.*;
import java.util.*;

public class Q11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();
        int max = 0;
        long maxNum = Long.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            Long number = Long.parseLong(br.readLine());

            map.put(number, map.getOrDefault(number,1)+1);
        }

        for(Long l : map.keySet()) {
            if(map.get(l)>max) {
                max = map.get(l);
                maxNum = l;
            }
            else if(map.get(l)==max) {
                maxNum = Long.min(maxNum,l);
            }
        }

        bw.write(String.valueOf(maxNum));
        bw.flush();
        bw.close();
        br.close();
    }
}
