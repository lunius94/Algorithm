package backjoon.basicmath.bronze;
import java.util.*;
import java.io.*;

public class Q2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int n = (c-a)/(a-b);
        int day = (c-a)%(a-b)==0? n+1:n+2;
        System.out.println(n);
    }

}
