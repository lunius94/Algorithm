package backjoon.greedy.bronze;
import java.io.*;

public class Q5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1000 - Integer.parseInt(br.readLine());
        int[] arr = {500, 100, 50, 10, 5, 1};

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count += N/arr[i];
            N%=arr[i];
        }
        System.out.println(count);
    }
}
