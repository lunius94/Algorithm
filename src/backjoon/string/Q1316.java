package backjoon.string;
import java.io.*;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            int[] arr = new int[26];
            for(int j = 0; j<str.length(); j++) {
                char c1 = str.charAt(j);
                int index = c1-'a';
                if(arr[index]!=0) break;
                else {
                    if (j == str.length() - 1) {
                        count++;
                    } else if (c1 != str.charAt(j + 1)) arr[index]++;
                }
            }
        }
        System.out.println(count);
    }
}
