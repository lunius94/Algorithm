package programmers.Lv1.success;
import java.util.*;

public class 성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String list = "RTCFJMAN";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list.length(); i++) {
            map.put(list.substring(i,i+1),0);
        }
        for(int i = 0; i < survey.length; i++) {
            int score = (choices[i]-4)*(-1);
            String s = survey[i].substring(0,1);
            map.put(s,map.get(s)+score);
        }

        for(int i = 0; i < list.length(); i+=2) {
            int score = map.get(list.substring(i,i+1)) - map.get(list.substring(i+1,i+2));
            if(score>=0) answer += list.substring(i,i+1);
            else answer+= list.substring(i+1,i+2);
        }
        return answer;
    }
}
