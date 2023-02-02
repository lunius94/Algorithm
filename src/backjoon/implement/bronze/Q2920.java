package backjoon.implement.bronze;
import java.io.*;
import java.util.*;

public class Q2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[8];
        for(int i = 0; i< 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int number;
        boolean check;
        if(arr[0] == 1) {
            number = 2;
            check = false;
            for(int i = 1; i<8; i++) {
                if(arr[i] != number) {
                    check = true;
                    break;
                }
                number++;
            }
            if(check) {
                System.out.println("mixed");
            }
            else {
                System.out.println("ascending");
            }
        }
        else if(arr[0] == 8) {
            number = 7;
            check = false;
            for(int i = 1; i<8; i++) {
                if(arr[i]!= number) {
                    check = true;
                    break;
                }
                number--;
            }
            if(check) {
                System.out.println("mixed");
            }
            else {
                System.out.println("descending");
            }
        }
        else System.out.println("mixed");
    }
}
