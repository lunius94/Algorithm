package backjoon.sorting;
import java.util.*;
import java.io.*;

public class Q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for(int i = 0; i< T; i++) {
            System.out.println(list.get(i));
        }
    }
}
