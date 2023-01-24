package backjoon.basicmath;
import java.util.*;
import java.io.*;

public class Q10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int Y = 0;
            int X = 0;
            if(x%h==0) {
                Y = h*100;
                X = x/h;
            }
            else {
                Y = x%h*100;
                X = x/h+1;
            }
            System.out.println(Y+X);
        }
    }
}
