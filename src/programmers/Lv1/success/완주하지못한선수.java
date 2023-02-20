package programmers.Lv1.success;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    // 효율성통과 실패
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean[] complete = new boolean[completion.length];

        for(int i = 0;i < participant.length; i++) {
            boolean match = false;
            for(int j = 0; j<completion.length; j++) {
                if(participant[i].equals(completion[j]) && !complete[j]) {
                    complete[j] = true;
                    match = true;
                    break;
                }
            }
            if(!match) answer = participant[i];
        }
        return answer;
    }

    public String solution1(String[] participant, String[] completion) {

        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i  = 0; i < participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }

        for(int i = 0;i <completion.length; i++) {
            map.put(completion[i],map.get(completion[i])-1);
        }

        for(int i = 0; i < participant.length; i++) {
            if(map.get(participant[i])==1) answer = participant[i];
        }
        return answer;
    }
}
