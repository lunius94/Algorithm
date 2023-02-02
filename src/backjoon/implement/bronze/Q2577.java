package backjoon.implement.bronze;
import java.io.*;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        for(int i = 0; i<3; i++) {
            sum *= Integer.parseInt(br.readLine());
        }
        int[] arr = new int[10];
        while(sum>0) {
            int index = sum%10;
            sum/=10;
            arr[index]++;
        }
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
