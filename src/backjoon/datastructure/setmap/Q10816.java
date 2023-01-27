package backjoon.datastructure.setmap;
import java.util.*;
import java.io.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) sb.append(map.get(num)).append(" ");
            else sb.append("0 ");
        }
        System.out.println(sb.toString());
    }
}
