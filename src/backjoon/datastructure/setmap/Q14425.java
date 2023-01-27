package backjoon.datastructure.setmap;
import java.util.*;
import java.io.*;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        for(int i =0; i < N; i++) {
            set.add(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            set.add(str);
            int size = set.size();
            if(size>N) {
                set.remove(str);
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
