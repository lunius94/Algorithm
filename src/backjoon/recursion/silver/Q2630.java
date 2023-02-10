package backjoon.recursion.silver;
import java.io.*;
import java.util.*;

public class Q2630 {
    private static int[] count = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i = 0; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recursion(arr);


        System.out.println(count[0] + " " + count[1]);
    }
    private static void recursion(int[][] arr) {
        int length = arr.length;
        int blue = 0;
        int white = 0;
        if(arr.length==2) {
            for(int i =0;i<2;i++) {
                for(int j = 0; j<2; j++) {
                    if(arr[i][j] == 0) white++;
                    else blue++;
                }
            }
            if(blue==4) count[1]++;
            else if(white==4) count[0]++;
            else {
                count[0] += white;
                count[1] += blue;
            }
            return;
        }
        else {
            for(int i = 0; i<length; i++) {
                for(int j = 0; j<length; j++) {
                    if(arr[i][j] == 0) white++;
                    else blue++;
                }
            }
            if(blue == length*length) {
                count[1]++;
            }
            else if(white==length*length) {
                count[0]++;
            }
            else {
                for(int i = 0; i < 4; i++) {
                    recursion(divideMatrix(arr,i));
                }
            }
        }
    }

    private static int[][] divideMatrix(int[][] arr, int num) {
        int length = arr.length/2;
        int[][] divided = new int[length][length];
        if(num==0) {
            for(int i = 0; i < length; i++) {
                divided[i] = Arrays.copyOfRange(arr[i],0,length);
            }
        }
        else if(num==1) {
            for(int i = 0; i < length; i++) {
                divided[i] = Arrays.copyOfRange(arr[i],length,arr.length);
            }
        }
        else if(num==2) {
            for (int i = 0; i < length; i++) {
                divided[i] = Arrays.copyOfRange(arr[i+length],0,length);
            }
        }
        else if(num==3) {
            for(int i = 0 ; i < length; i++) {
                divided[i] = Arrays.copyOfRange(arr[i+length],length,arr.length);
            }
        }
        return divided;
    }
}
