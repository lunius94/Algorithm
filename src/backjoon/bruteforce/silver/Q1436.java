package backjoon.bruteforce.silver;
import java.io.*;

public class Q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int count = 0;
        for(int i = 666; i<=Integer.parseInt(N+666); i++) {
            if(String.valueOf(i).indexOf("666")!=-1) count++;
            if(count==Integer.parseInt(N)) {
                System.out.println(i);
                return;
            }
        }
    }
}
