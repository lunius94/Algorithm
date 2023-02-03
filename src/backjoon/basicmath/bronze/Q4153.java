package backjoon.basicmath.bronze;
import java.io.*;
import java.util.*;

public class Q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            if(str.equals("0 0 0")) break;
            else {
                StringTokenizer st = new StringTokenizer(str," ");
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                int O = Integer.parseInt(st.nextToken());
                if(N*N+M*M==O*O || N*N+O*O==M*M || N*N == M*M+O*O) System.out.println("right");
                else System.out.println("wrong");
            }
        }
    }
}
