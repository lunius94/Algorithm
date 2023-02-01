package backjoon.greedy.silver;
import java.io.*;

public class Q1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        int count = 0;
        long sum = 0;

        while(sum<=S) {
            count++;
            sum += count;
        }
        System.out.println(count-1);
    }
}
