package programmers.Lv2.success;

import java.util.HashMap;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        String[] answer = {};
        String[][] split = new String[record.length][3];

        Map<String, String> userMap = new HashMap<>();
        int size = 0;

        for(int i = 0; i < record.length; i++) {
            split[i] = record[i].split(" ");
            if(split[i][0].equals("Enter")) {
                userMap.put(split[i][1],split[i][2]);
                size++;
            }
            else if(split[i][0].equals("Change")) {
                userMap.put(split[i][1],split[i][2]);
            }
            else {
                size++;
            }
        }
        answer = new String[size];
        int idx = 0;
        for(int i = 0; i < record.length; i++) {
            String username = userMap.get(split[i][1]);
            if(split[i][0].equals("Enter")) {
                answer[idx] = username + "님이 들어왔습니다.";
                idx++;
            }
            else if(split[i][0].equals("Leave")) {
                answer[idx] = username + "님이 나갔습니다.";
                idx++;
            }
        }

        return answer;
    }
}
