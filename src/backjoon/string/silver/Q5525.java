package backjoon.string.silver;
import java.io.*;
import java.util.*;
public class Q5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String str= br.readLine();
        String IOI = "IOI";
        String target = IOI+"OI".repeat(N-1);

        int count = 0;
        for(int i = target.length(); i<str.length(); i++) {
            String sub = str.substring(i-target.length(),i);
            if(sub.equals(target)) count++;
        }
        System.out.println(count);
    }
}
