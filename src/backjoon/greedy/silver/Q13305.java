package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] distances = new int[N-1];
        for(int i = 0; i < N-1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        int[] prices = new int[N];
        for(int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        long price = prices[0];
        long distance = 0;
        long sum = 0;

        for(int i = 0; i<N-1; i++) {
            distance += distances[i];
            if(price>prices[i+1]) {
                sum += price * distance;
                distance = 0;
                price = prices[i+1];
            }
        }

        sum += price*distance;
        System.out.println(sum);
    }
}
