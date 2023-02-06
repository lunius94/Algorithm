package backjoon.dynamicprogramming.silver;
import java.io.*;

public class Q1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];

        for(int i = 2; i < arr.length; i++) {
            if(i%2==0 && i%3==0) {
                arr[i] = Math.min(Math.min(arr[i/2],arr[i/3]),arr[i-1])+1;
            }
            else if(i%2==0) {
                arr[i] = Math.min(arr[i/2],arr[i-1])+1;
            }
            else if(i%3==0) {
                arr[i] = Math.min(arr[i/3],arr[i-1])+1;
            }
            else arr[i] = arr[i-1]+1;
        }
        System.out.println(arr[N]);
    }
}
