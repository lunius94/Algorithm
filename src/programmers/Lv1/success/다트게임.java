package programmers.Lv1.success;
import java.util.*;
import java.util.regex.Pattern;

public class 다트게임 {
    public int solution(String dartResult) {
        Map<Integer, Integer> map = new HashMap<>();
        int key = 1;
        int index = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            String target = dartResult.substring(i,i+1);
            if(Pattern.matches("[SDT]",target)) {
                int score = Integer.parseInt(dartResult.substring(index,i));
                if(target.equals("S")) {
                    map.put(key,score);
                    key++;
                }
                else if(target.equals("D")) {
                    map.put(key,score*score);
                    key++;
                }
                else if(target.equals("T")) {
                    map.put(key,score*score*score);
                    key++;
                }
                index = i+1;
            }
            if(Pattern.matches("[*#]",target)){
                if (target.equals("*")) {
                    if (key != 2) map.put(key - 2, map.get(key - 2) * 2);
                    map.put(key - 1, map.get(key - 1) * 2);
                } else {
                    if (key != 2) map.put(key - 2, map.get(key - 2) * (-1));
                    map.put(key - 1, map.get(key - 1) * (-1));
                }
                index = i+1;
            }

        }
        int answer = 0;
        for(int i = 1; i < key; i++) {
            answer += map.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        다트게임 sol = new 다트게임();
        String dartResult = "1S2D*3T";
        System.out.println(sol.solution(dartResult));
    }
}
