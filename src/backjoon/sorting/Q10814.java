package backjoon.sorting;
import java.util.*;
import java.io.*;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];
        for(int i = 0; i <N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr,(a,b) -> Integer.parseInt(a[0])-Integer.parseInt(b[0]));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<arr.length; i++) {
            sb.append(String.join(" ",arr[i])).append("\n");
        }
        System.out.println(sb.toString());
    }
}
