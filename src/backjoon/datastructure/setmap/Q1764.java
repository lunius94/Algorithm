package backjoon.datastructure.setmap;
import java.io.*;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            int size = set.size();
            set.add(str);
            if(set.size()>size) set.remove(str);
            else list.add(str);
        }
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
