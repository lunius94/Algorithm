package backjoon.bruteforce.silver;
import java.io.*;
import java.util.*;

public class Q1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][M];

        for(int i = 0; i<N; i++) {
            arr[i] = br.readLine().split("");
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<= N-8; i++) {
            for(int j = 0; j<=M-8; j++) {
                int cur = checkChess(i,j,arr);
                if(min>cur) min = cur;
            }
        }
        System.out.println(min);
    }

    public static int checkChess(int num1, int num2, String[][] arr) {
        int black = 0;
        //먼저 시작점이 블랙일 때
        for(int i = num1; i < num1+8; i++) {
            for (int j = num2; j< num2+8; j++) {
                int num = i+j;
                if((num%2==0 && arr[i][j].equals("W")) || (num%2==1 && arr[i][j].equals("B"))){
                    black++;
                }
            }
        }
        int white = 0;
        for(int i = num1; i < num1+8; i++) {
            for (int j = num2; j< num2+8; j++) {
                int num = i+j;
                if((num%2==0 && arr[i][j].equals("B")) || (num%2==1 && arr[i][j].equals("W"))){
                    white++;
                }
            }
        }
        return Math.min(black,white);
    }
}
