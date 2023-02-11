package backjoon.recursion.silver;
import java.io.*;
import java.util.*;

public class Q1780 {
    static int[] result = {0,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recursion(arr);
        StringBuilder sb= new StringBuilder();
        sb.append(result[0]+"\n"+result[1]+"\n"+result[2]);
        System.out.println(sb);

    }
    static void recursion(int[][] arr) {
        if(arr.length==1) {
            int num= arr[0][0];
            if(num==-1) result[0]++;
            else if(num==0) result[1]++;
            else if(num==1) result[2]++;
        }
        else {
            int[] numbers = new int[3];
            for(int i = 0; i< arr.length; i++) {
                for(int j = 0; j<arr.length; j++) {
                    numbers[arr[i][j]+1]++;
                }
            }
            if(numbers[0]==arr.length*arr.length) result[0]++;
            else if(numbers[1]==arr.length*arr.length) result[1]++;
            else if(numbers[2]==arr.length*arr.length) result[2]++;
            else {
                for(int i = 0; i<9; i++) {
                    recursion(divide(arr,i));
                }
            }
        }
    }

    static int[][] divide(int[][] arr, int num) {
        int length = arr.length/3;
        int[][] divided = new int[length][length];
        int num1 = num/3;
        int num2 = num%3;
        for(int i = 0; i < length; i++) {
            divided[i] = Arrays.copyOfRange(arr[i+length*num1],num2*length,(num2+1)*length);
        }
        return divided;
    }
}
