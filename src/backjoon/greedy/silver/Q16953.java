package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 0;
        while(B>=A) {
            if(B==A) {
                count++;
                System.out.println(count);
                return;
            }
            else if(B%2==0) {
                B/=2;
                count++;
            }
            else if(B%10==1) {
                B/=10;
                count++;
            }
            else break;
        }
        System.out.println(-1);
    }
}
