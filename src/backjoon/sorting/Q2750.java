package backjoon.sorting;
import java.io.*;
import java.util.*;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];
        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = 0 ; i< T; i++) {
            System.out.println(arr[i]);
        }
    }
}
