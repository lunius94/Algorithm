package backjoon.datastructure.setmap;
import java.util.*;
import java.io.*;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numMap = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameMap.put(name,i);
            numMap.put(i,name);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(nameMap.containsKey(str)) {
                sb.append(nameMap.get(str)).append("\n");
            }
            else {
                Integer num = Integer.parseInt(str);
                sb.append(numMap.get(num)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
