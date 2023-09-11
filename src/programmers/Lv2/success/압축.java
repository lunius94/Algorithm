package programmers.Lv2.success;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 압축 {
    public int[] solution(String msg) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        int number;

        for(number = 1; number <= 26; number++) {
            char c = 'A';
            map.put(String.valueOf((char)(c+number)),number);
        }

        List<Integer> list = new ArrayList<>();
        String tmpMsg = "";

        for(int i = 0; i < msg.length(); i++) {

        }

        return answer;
    }
}
