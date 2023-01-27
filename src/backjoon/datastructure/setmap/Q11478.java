package backjoon.datastructure.setmap;
import java.io.*;
import java.util.*;

public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        String str = br.readLine();

        for(int i = 1; i <= str.length(); i++) {
            for(int j = 0; j+i<=str.length(); j++) {
                set.add(str.substring(j,j+i));
            }
        }
        System.out.println(set.size());
    }
}
