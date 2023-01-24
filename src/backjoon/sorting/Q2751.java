package backjoon.sorting;
import java.util.*;
import java.io.*;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i = 0; i< T; i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
