package backjoon.sorting;
import java.io.*;
import java.util.*;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr,(a,b)-> a.length()==b.length()? a.compareTo(b):a.length()-b.length());

        for(int i = 0; i< arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
