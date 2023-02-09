package backjoon.greedy.bronze;
import java.io.*;
import java.util.*;
public class Q10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] times = {300,60,10};
        if(N%10!=0) System.out.println(-1);
        else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 3; i++) {
                sb.append(N/times[i]+" ");
                N%=times[i];
            }
            System.out.println(sb);
        }
    }
}
