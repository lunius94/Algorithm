package backjoon.sorting;
import java.util.*;
import java.io.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
//        Arrays.sort(arr,Comparator.reverseOrder());
        Arrays.sort(arr,(a,b)->b.compareTo(a));
        str = String.join("",arr);
        System.out.println(str);

    }
}
