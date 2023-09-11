package backjoon.datastructure.setmap.silver;

import java.io.*;
import java.util.*;

public class Q1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String book = br.readLine();

            map.put(book, map.getOrDefault(book,1)+1);
        }

        int max = 0;
        String bestSeller = "";

        for(String s : map.keySet()) {
            if(map.get(s) > max) {
                max = map.get(s);
                bestSeller = s;
            }
            else if(map.get(s) == max) {
                if(bestSeller.compareTo(s) > 0) {
                    bestSeller = s;
                }
            }
        }
        bw.write(bestSeller);
        bw.flush();
        bw.close();
        br.close();
    }
}
