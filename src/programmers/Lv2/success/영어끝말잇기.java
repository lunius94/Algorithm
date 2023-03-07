package programmers.Lv2.success;
import java.util.*;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        영어끝말잇기 sol = new 영어끝말잇기();
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(sol.solution(n,words)));
    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String,Boolean> map = new HashMap<>();

        String prev = words[0];
        for(int i = 1; i < words.length; i++) {
            map.put(prev,true);
            String s = prev.substring(prev.length()-1,prev.length());
            if(words[i].startsWith(s) && !map.containsKey(words[i])) {
                prev = words[i];
            }
            else {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
        }

        return answer;
    }
}
