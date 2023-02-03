package backjoon.basicmath.bronze;
import java.io.*;
import java.util.*;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr1 = new int[2];
        arr1[0] = Integer.parseInt(st.nextToken());
        arr1[1] = Integer.parseInt(st.nextToken());

        int[] arr2 = new int[2];
        st = new StringTokenizer(br.readLine()," ");
        arr2[0] = Integer.parseInt(st.nextToken());
        arr2[1] = Integer.parseInt(st.nextToken());

        int[] arr3 = new int[2];
        st = new StringTokenizer(br.readLine()," ");
        arr3[0] = Integer.parseInt(st.nextToken());
        arr3[1] = Integer.parseInt(st.nextToken());

        int x = arr1[0]==arr2[0]? arr3[0]:arr1[0]==arr3[0]? arr2[0]:arr1[0];
        int y = arr1[1]==arr2[1]? arr3[1]:arr1[1]==arr3[1]? arr2[1]:arr1[1];

        System.out.println(x + " " + y);
    }
}
