package backjoon.datastructure.setmap;
import java.io.*;
import java.util.*;

public class Q1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        Set<Integer> setA = new HashSet<>();
        for(int i = 0; i < N; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine()," ");
        Set<Integer> setB = new HashSet<>();
        for(int i = 0; i < M ; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(method(setA,setB)+method(setB,setA));

    }
    public static int method(Set<Integer> setA, Set<Integer> setB) {
        int count = 0;
        Iterator<Integer> it = setA.iterator();
        while(it.hasNext()) {
            int num = it.next();
            if(!setB.contains(num)) count++;
        }
        return count;
    }
}
