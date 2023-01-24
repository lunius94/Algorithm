package backjoon.String;
import java.io.*;

public class Q2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i< N; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            String str = arr[1];
            for(int j = 0; j<str.length(); j++) {
                sb.append(str.substring(j,j+1).repeat(n));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
