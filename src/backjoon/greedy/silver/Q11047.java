package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = N-1; i >=0 ; i--) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int index = 0;
        while(money>0) {
            count += money/arr[index];
            money%=arr[index];
            index++;
        }
        System.out.println(count);
    }
}
