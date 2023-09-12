package backjoon.datastructure.setmap.silver;

import java.io.*;
import java.util.*;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            int result = 1;
            Map<String, Integer> map = new HashMap<>();

            for(int j = 0; j < M; j++) {
                String cloth = br.readLine().split(" ")[1];
                map.put(cloth, map.getOrDefault(cloth,0)+1);
            }
            Iterator iter = map.keySet().iterator();
            while(iter.hasNext()) {
                result *= (map.get(iter.next())+1);
            }

            System.out.println(result-1);
        }
    }
}
