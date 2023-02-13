package backjoon.recursion.silver;
import java.io.*;
import java.util.*;

public class Q1992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for(int j = 0; j<N; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        System.out.println(recursion(arr));

    }

    static String recursion(int[][] arr) {
        int zero = 0;
        int one = 0;
        String result = "(";
        if(arr.length ==2) {
            for(int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j]==0) {
                        zero++;
                        result+=arr[i][j];
                    }
                    else {
                        one++;
                        result+=arr[i][j];
                    }
                }
            }
            result += ")";
            if(zero == 4) return "0";
            else if(one == 4) return "1";
            else return result;
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j]==0) zero++;
                    else one++;
                }
            }
            if(zero == arr.length*arr.length) return "0";
            else if(one == arr.length * arr.length) return "1";
            else {
                for(int i = 0; i < 4; i++) {
                    result += recursion(divide(arr,i,2));
                }
                result += ")";
            }
            return result;
        }
    }

    static int[][] divide(int[][] arr, int num, int divisor) {
        int length = arr.length/divisor;
        int[][] result = new int[length][length];

        int a = num/divisor;
        int b= num%divisor;
        for(int i = 0; i < length; i++) {
            result[i] = Arrays.copyOfRange(arr[i+a*length],b*length,(b+1)*length);
        }
        return result;
    }
}
