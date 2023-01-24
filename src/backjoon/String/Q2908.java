package backjoon.String;
import java.io.*;
import java.util.*;

public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String str = sb.reverse().toString();
        String[] arr = str.split(" ");

        String result = Integer.parseInt(arr[0])>Integer.parseInt(arr[1])? arr[0]:arr[1];
        System.out.println(result);
    }
}
