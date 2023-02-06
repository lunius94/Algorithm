package backjoon.implement.silver;
import java.io.*;
import java.util.*;

public class Q11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> S = new HashSet<>();
        Set<String> allS = new HashSet<>();
        for(int i = 1; i<=20; i++) {
            allS.add(i+"");
        }
        StringBuilder sb= new StringBuilder();
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String target = st.nextToken();
            String str;
            switch (target) {
                case "add":
                    str = st.nextToken();
                    S.add(str);
                    break;
                case "remove":
                    str = st.nextToken();
                    S.remove(str);
                    break;
                case "check":
                    str = st.nextToken();
                    if(S.contains(str)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "toggle":
                    str = st.nextToken();
                    if(S.contains(str)) S.remove(str);
                    else S.add(str);
                    break;
                case "all":
                    S = allS;
                    break;
                case "empty":
                    S.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}
