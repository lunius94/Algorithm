package backjoon.basicmath.silver;
import java.io.*;
import java.util.*;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count = n;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num==1) count--;
            if(num>3) {
                if(num%2==0) count--;
                else {
                    for(int j = 2; j<=Math.sqrt(num); j++) {
                        if(num%j==0) {
                            count--;
                            break;
                        }
                    }

                }
            }
        }
        System.out.println(count);
    }
}
