package backjoon.datastructure.setmap.silver;

import java.io.*;
import java.util.*;

public class Q7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");

            if(tmp[1].equals("enter")) {
                set.add(tmp[0]);
            }
            else {
                set.remove(tmp[0]);
            }
        }
        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
