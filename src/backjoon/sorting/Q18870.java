package backjoon.sorting;
import java.io.*;
import java.util.*;

public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Map<Integer,Integer> hashMap = new HashMap<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int rank = 0;
        for(int i : copy) {
            if(!hashMap.containsKey(i)) {
                hashMap.put(i,rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(hashMap.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
