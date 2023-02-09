package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int sum = 0;
        boolean hasZero = false;
        for(int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
            if(str[i].equals("0")) hasZero = true;
        }
        if(hasZero && sum%3==0) {
            Arrays.sort(str,Collections.reverseOrder());
            System.out.println(String.join("",str));
        }
        else System.out.println(-1);
    }
}
